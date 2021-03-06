package july09;
import java.sql.*;
import java.sql.DriverManager;

public class connecttest3 {

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
		String memberid = "A10";
		String name = "성시경";
		String addr = "천안시내";
		PreparedStatement pstmt = null;
		try {
			String sql = "update member set addr = ?, name = ? where memberid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(3, memberid);
			pstmt.setString(2, name);
			pstmt.setString(1, addr);
			pstmt.executeUpdate();
			System.out.println("수정완료");
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
