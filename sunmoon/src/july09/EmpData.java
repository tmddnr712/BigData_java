package july09;
import java.sql.Date;

public class EmpData {
	private int no;
	private String name;
	private String job;
	private int mgr;
	private Date hiredate;
	private float salary;
	private float comm;
	private int deptno;
	public EmpData() {}
	
	public EmpData(int no, String name, String job, int mgr, Date hiredate, float salray,
			       float comm, int deptno) {
		this.no = no; this.name = name; this.job = job; this.mgr = mgr;
		this.hiredate = hiredate; this.salary = salary; this.comm = comm;
		this.deptno = deptno;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String toString() {
		return "번호: " + no + "이름: " + name + "직업: " + job + "mgr: " + mgr +
				"입사일: " + hiredate + "급여: " + salary + "회사: " + comm +
				"부서: " + deptno;
	}
	
}
