package ch20.database_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardWithFileInsertExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.74.137:1521/xe",
                    "java",
                    "1234"
            );
            System.out.println("연결 성공");

            String sql = "" +
                    "INSERT INTO boards(bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
                    "VALUES(SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";

            // PreparedStatement 얻기 및 값 지정
            /* 두 번째 매개 값은 INSERT 문이 실행된 후 가져올 컬럼 값
            *  bno 라고 주면 bno 컬럼 값을 가져온다.
            * SQL문이 실행되기 전까지는 SEQ_BNO.NEXTVAL로 얻은 번호를 모르기 때문에 SQL문이 실행된 이후에
            * bno 컬럼에 실제로 저장된 값을 얻어보는 것*/
            PreparedStatement pstmt = connection.prepareStatement(sql, new String[]{"bno"});
            pstmt.setString(1, "눈 오는 날");
            pstmt.setString(2, "함박눈이 내려요");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "snow.jpg");
            pstmt.setBlob(5, new FileInputStream("src/ch20/oracle/sec06/snow.jpg"));

            int rows = pstmt.executeUpdate();

            //bno 값 얻기
            if (rows == 1){
                ResultSet rs  = pstmt.getGeneratedKeys();
                if (rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println("저장된 bno :" + bno);
                }
                rs.close();
            }
            pstmt.close();

        } catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (connection != null){
                try {
                    connection.close();
                    System.out.println("연결 끊기");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
