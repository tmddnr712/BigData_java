package july12;

import java.sql.*;

import java.util.*;

public class sungjuk_Insert {



	public void insertMethod() {		

		Scanner scan = new Scanner(System.in);

		String driver = "org.mariadb.jdbc.Driver";

		String url = "jdbc:mariadb://127.0.0.1:3308/grade";

		String sql = "INSERT INTO gradeinfo(CODE,NAME,MAT,KOR,ENG) VALUES(?, ?, ?, ?, ?)";			

		Connection con = null;

		PreparedStatement pstmt = null;

		

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");

			pstmt = con.prepareStatement(sql);

			

			System.out.printf("코드(번호) 입력: ");

			String code = scan.next();

			System.out.printf("이름 입력: ");

			String name = scan.next();			

			System.out.printf("수학점수 입력: ");

			int mat = scan.nextInt();

			System.out.printf("국어점수 입력: ");

			int kor = scan.nextInt();			
			
			System.out.printf("영어점수 입력: ");

			int eng = scan.nextInt();

			

			pstmt.setString(1, code);

			pstmt.setString(2, name);

			pstmt.setInt(3, mat);

			pstmt.setInt(4, kor);
			
			pstmt.setInt(5, eng);

			int cnt = pstmt.executeUpdate(); 

			System.out.println(cnt + "건이 실행되었습니다.");			

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