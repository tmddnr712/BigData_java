package july12;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.util.*;

public class sungjuk_Delete {



	public void deleteMethod() {

		Scanner scan = new Scanner(System.in);

		String driver = "org.mariadb.jdbc.Driver";

		String url = "jdbc:mariadb://127.0.0.1:3308/grade";

		String sql = "DELETE FROM gradeinfo WHERE CODE = ?";

		String code = "";

		

		Connection con = null;

		PreparedStatement pstmt = null;		

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");

			pstmt = con.prepareStatement(sql);

			

			System.out.println("삭제할 코드(번호)를 입력하시오");

			code = scan.next();

			

			pstmt.setString(1, code);

			int cnt = pstmt.executeUpdate(); 

			System.out.println(cnt);

		}

		catch (Exception e) {System.out.println(e.getMessage());}

		finally {

			try {

				pstmt.close();

				con.close();

			} catch (Exception e) {

			}

		}

	}

}