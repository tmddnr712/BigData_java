package july09;
import java.sql.*;
public class coneecttest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // ����̹� �ε�
			// ���ӽ� �ʿ��� ������ ip / port��ȣ / �����ͺ��̽� / id / password
			String url = "jdbc:mariadb://127.0.0.1:3308/hobby"; // http://www.naver.com
			conn = DriverManager.getConnection(url, "root", "1q2w3e4r!@N");
			System.out.println("mairadb ���� ����!");
		}
		catch(Exception e) {e.printStackTrace();}
		PreparedStatement pstmt = null; //��ɾ� ���� �غ� ��ü
		ResultSet rs = null;
		try {
			String sql = "SELECT memberid, name, addr FROM member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // Ŀ��(cursor)
			while(rs.next()) {// Ŀ���̵�
				String num = rs.getString("memberid");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num +"/" + name + "/" + addr);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}
			catch(Exception e) {}
		}//try
	}

}
