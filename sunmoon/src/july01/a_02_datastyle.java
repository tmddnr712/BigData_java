package july01;
import java.util.ArrayList;
import java.util.List;
class MemberDto{
	private int num;
	private String name;
	private String addr;
	
	public MemberDto() {}
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
		return "번호: " + num + "이름: " + name + "주소: " + addr;
	}
}
public class a_02_datastyle {

	public static void main(String[] args) {
		ArrayList<String> msgs = new ArrayList<String>();
		msgs.add("하나"); // msgs=[0] = "하나";
		msgs.add("둘");
		msgs.add("셋");
		
		for(int i = 0; i < msgs.size(); i++) {
			String tmp = msgs.get(i);
			System.out.println(tmp);
		}
		
		for(String tmp:msgs) {
			System.out.println(tmp);
		}
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		for(int i = 0; i < nums.size(); i++) {
			Integer tmp = nums.get(i);
			System.out.println(tmp);
		}
		ArrayList<MemberDto> dto = new ArrayList<MemberDto>(); // 배열인스턴스(주소공간) 한 것과 동일
		MemberDto dto1 = new MemberDto(1, "대한이", "종로구");
		MemberDto dto2 = new MemberDto(2, "민국이", "아산시");
		MemberDto dto3 = new MemberDto(3, "만세", "천안시");
		dto.add(dto1);
		dto.add(dto2);
		dto.add(dto3);
		for(MemberDto dt:dto) {
			System.out.println(dt);
		}
	}

}
