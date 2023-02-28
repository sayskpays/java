package ch20.database_io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
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
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
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
