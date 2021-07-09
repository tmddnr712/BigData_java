package july09;

public class MemberDTO {
	private String memberid;
	private String name;
	private String addr;
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return "번호:" + memberid + "이름:" + name + "주소:" + addr;
	}
}
