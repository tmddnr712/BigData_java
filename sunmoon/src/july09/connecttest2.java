package july09;
import java.sql.*;
public class connecttest2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3308/hobby";
			conn = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");
			System.out.println("mairadb 접속 성공!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		String memberid = "A10"; // 앞으로 INT로 해줄것,,,,, 성공했으니 안해줘도 노상관 ㅋ
		String name = "성시경";
		String addr = "종로구";
		
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO member(memberid, name, addr) " + "VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberid); // num이 INT로 되어있을때는 auto crease 설정 되어있을때 이줄 필요 없음
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}
			catch(Exception e) {}
		}
	}

}
