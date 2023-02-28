package ch20.database_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.74.137:1521/xe",
                    "java",
                    "1234"
            );

            String sql = new StringBuilder()
                    .append("UPDATE boards SET")
                    .append("btitle=?, ")
                    .append("bcontent=?, ")
                    .append("bfilename=?, ")
                    .append("bfiledata=? ")
                    .append("WHERE bno=? ")
                    .toString();

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "snowman.jpg");
            pstmt.setBlob(4, new FileInputStream("src/ch20/oracle/sec07/snowman.jpg"));
            pstmt.setInt(5, 3); // boards 테이블에 있는 게시물 번호 지정

            int rows = pstmt.executeUpdate();
            pstmt.close();

        } catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
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
