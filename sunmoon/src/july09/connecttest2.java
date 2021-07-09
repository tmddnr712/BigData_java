package july09;
import java.sql.*;
public class connecttest2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3308/hobby";
			conn = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");
			System.out.println("mairadb ���� ����!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		String memberid = "A10"; // ������ INT�� ���ٰ�,,,,, ���������� �����൵ ���� ��
		String name = "���ð�";
		String addr = "���α�";
		
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO member(memberid, name, addr) " + "VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberid); // num�� INT�� �Ǿ��������� auto crease ���� �Ǿ������� ���� �ʿ� ����
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.executeUpdate();
			System.out.println("ȸ�������� �����߽��ϴ�.");
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