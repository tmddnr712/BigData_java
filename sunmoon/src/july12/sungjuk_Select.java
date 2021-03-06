package july12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sungjuk_Select{

	public void selectMethod() {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3308/grade";
		String sql = "SELECT * FROM gradeinfo";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			while (rs.next()) {
				String code = rs.getString("CODE"); 
				String name = rs.getString("NAME"); 
				int mat = rs.getInt("mat");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				System.out.println(code + "\t" + name + "\t" + mat + "\t" + kor + "\t" + eng);
			}
		}		
		catch (Exception e) {System.out.println(e.getMessage());}		
		finally {
			try {rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}
}