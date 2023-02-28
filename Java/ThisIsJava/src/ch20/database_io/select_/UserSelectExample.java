package ch20.database_io.select_;

import java.sql.*;

public class UserSelectExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.74.137:1521/xe",
                    "java",
                    "1234"
            );

            String sql = ""+
                    "SELECT userid, username, userpassword, userage, useremail"+
                    "FROM users" +
                    "WHERE userid=?";

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"winter");

            // SQL 문 실행 후, ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){ // 1개의 데이터 행을 가져왔을 경우
                User user = new User();
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString("userpassword"));
                user.setUserAge(rs.getInt(4));
                user.setUserEmail(rs.getString(5));
                System.out.println(user);
            }else{
                System.out.println("사용자 아이디가 존재하지 않음");
            }
            rs.close();
            pstmt.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
