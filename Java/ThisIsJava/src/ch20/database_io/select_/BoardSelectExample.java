package ch20.database_io.select_;

import java.io.*;
import java.sql.*;

public class BoardSelectExample {

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
                    "SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata" +
                    "FROM boards" +
                    "WHERE bwriter=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            // SQL문 실행 후, ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Board board = new Board();
                board.setBNO(rs.getInt("bno"));
                board.setBTITLE(rs.getString("btitle"));
                board.setBCONTENT(rs.getString("bcontent"));
                board.setBWRITER(rs.getString("bwriter"));
                board.setBDATE(rs.getDate("dbdate"));
                board.setBFILENAME(rs.getString("bfilename"));
                board.setBFILEDATA(rs.getBlob("bfiledata"));

                // 파일로 저장
                Blob blob = board.getBFILEDATA();
                if (blob != null) {
                    InputStream is = blob.getBinaryStream();
                    OutputStream os = new FileOutputStream("C:/Temp"+board.getBFILENAME());
                    is.transferTo(os);
                    os.flush();
                    os.close();
                    is.close();
                }
            }
            rs.close();
            pstmt.close();
        } catch (ClassNotFoundException | SQLException | RuntimeException | IOException e) {
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
