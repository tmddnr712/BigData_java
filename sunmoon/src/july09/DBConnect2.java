package july09;
import java.sql.*;
import java.sql.DriverManager;

public class DBConnect2 {
	private Connection conn;
	public DBConnect2() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3308/sunmoon";
			conn = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");
			System.out.println("mairadb ���� ����!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getconn() {
		return conn;
	}
}
