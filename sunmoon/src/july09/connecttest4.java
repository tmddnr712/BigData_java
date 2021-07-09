package july09;
import java.sql.*;
public class connecttest4 {

	public static void main(String[] args) {
		Connection conn = new DBConnect().getconn();
		PreparedStatement pstmt = null;
		try {
			String name = "¼º½Ã°æ";
			String sql = "DELETE FROM member where name =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
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
