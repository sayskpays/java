

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@192.168.29.166:1521:XE";
	private static final String USER = "system";
	private static final String PWD = "oracle";

    public static void main(String[] args) throws Exception {
        Class.forName(DRIVER);

		try(Connection conn = DriverManager.getConnection(URL, USER, PWD)){
			System.out.println(conn);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}
