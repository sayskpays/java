package ch20.database_io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.74.137:1521/xe",
                    "java",
                    "1234"
            );

            String sql = "DELETE FROM boards WHERE bwriter=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수" + rows);

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
