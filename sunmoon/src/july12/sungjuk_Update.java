package july12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class sungjuk_Update {



	public void updateMethod() {		

		Scanner scan = new Scanner(System.in);

		String driver = "org.mariadb.jdbc.Driver";

		String url = "jdbc:mariadb://127.0.0.1:3308/grade";

		String sql = "UPDATE gradeinfo SET NAME = ?, MAT = ?, KOR = ?, ENG = ? WHERE CODE = ?";			

		Connection con = null;

		PreparedStatement pstmt = null;		

		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");

			pstmt = con.prepareStatement(sql);

			

			System.out.printf("수정할 코드(번호) 입력: ");

			String code = scan.next();

			System.out.printf("수정할 이름 입력: ");

			String name = scan.next();			

			System.out.printf("수정할 수학점수 입력: ");

			int mat = scan.nextInt();			
			
			System.out.printf("수정할 국어점수 입력: ");

			int kor = scan.nextInt();	
			
			System.out.printf("수정할 영어점수 입력: ");

			int eng = scan.nextInt();	

			

			pstmt.setString(1, name);

			pstmt.setInt(2, mat);		
			
			pstmt.setInt(3, kor);		
			
			pstmt.setInt(4, eng);		

			pstmt.setString(5, code);

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
