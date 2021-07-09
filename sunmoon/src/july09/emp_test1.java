// ����: emp���� �����͸� select �մϴ�. �̶� dto�� ��ġ�ϴ� empDTO�� �ۼ��ϰ� ����ϼ���
// - toString�� �������̵��ϼ���
// �����ڸ� �̿��ؼ� �����͸� �ʱ�ȭ �ϼ���

package july09;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
public class emp_test1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		EmpData emp = new EmpData();
		EmpData emp = null;
		ArrayList<EmpData> list = new ArrayList<EmpData>();
		Iterator<EmpData> itr = null;
		conn = new DBConnect2().getconn();
		
		try {
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // ResultSet
			while(rs.next()) {// �Ѱ��� ������ ����
//				int no = rs.getInt("empno");
//				String name = rs.getString("name");
//				String job = rs.getString("job");
//				int mgr = rs.getInt("mgr");
//				Date hiredate = rs.getDate("hiredate");
//				float sal = rs.getFloat("salary");
//				float comm = rs.getFloat("comm");
//				int deptno = rs.getInt("deptno");
//				emp.setNo(no);
//				emp.setName(name);
//				emp.setJob(job);
//				emp.setMgr(mgr);
//				emp.setHiredate(hiredate);
//				emp.setSalary(sal);
//				emp.setComm(comm);
//				emp.setDeptno(deptno);
				emp = new EmpData(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"),
						          rs.getInt("mgr"), rs.getDate("hiredate"), rs.getFloat("sal"),
						          rs.getFloat("comm"), rs.getInt("deptno"));
				list.add(emp);
				System.out.println(emp);
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
		}
		itr = list.iterator();
		while(itr.hasNext()) {
			EmpData element = (EmpData) itr.next();
			System.out.println(element);
		}
		list.forEach(a-> {System.out.println(a);});
		
	}

}
