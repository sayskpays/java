package ch20.database_io.procedure_function_call;

import java.sql.*;

public class FunctionCallExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.74.137:1521/xe",
                    "java",
                    "1234"
            );


            // 매개변수화된 호출문 작성과 CallableStatement 얻기
            String sql = "{? = call user_login(?, ?)}";
            CallableStatement cstmt = conn.prepareCall(sql);

            // ? 값 지정 및 리턴 타입 지정
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, "winter");
            cstmt.setString(3, "12345");

            // 함수 실행 및 리턴 값 얻기
            cstmt.execute();
            int result = cstmt.getInt(1);

            cstmt.close();

            // 로그인 결과
            String message = switch (result){
                case 0 -> "로그인 성공";
                case 1 -> "비밀번호 틀림";
                default -> "아이디가 존재하지 않음";
            };

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
