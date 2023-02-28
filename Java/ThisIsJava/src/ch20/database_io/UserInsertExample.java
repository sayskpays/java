package ch20.database_io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.74.137:1521/xe",
                    "java",
                    "1234"
            );
            System.out.println("연결 성공");

            String sql = new StringBuilder()
                    .append("INSERT INTO users(userid, username, userpassword, userage)")
                    .append("VALUES(?,?,?,?,?)")
                    .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");
            pstmt.setString(2, "한겨울");
            pstmt.setString(3, "12345");
            pstmt.setInt(4, 25);
            pstmt.setString(5, "winter@mycompany.com");

            // SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수:" + rows);
            pstmt.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
