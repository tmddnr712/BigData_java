// 문제 : 
// 주소록 class : Member
// name, zipcode, address, add1, add2, ssn1, ssn2, age의 정보를 저장
// 대한이 123-456, '서울', '종로구', '11111', '1111118', 20
package june625;

public class Member {
	String name;
	String zipcode;
	String address;
	String add1;
	String add2;
	String ssn1;
	String ssn2;
	int age;
	
	public void setPMemberName(String name) { // get/set 함수
		this.name = name;
	}
	public String getMemberName() {
		return name;
	}
	
	public void setMemberAge(int age) { // get/set 함수
		this.age = age;
	}
	public int getMemberAge() {
		return age;
	}
	
	public void setPMemberaddress(String address) { // get/set 함수
		this.address = address;
	}
	public String getMemberaddress() {
		return address;
	}
	
	public void setPMemberadd1(String add1) { // get/set 함수
		this.add1 = add1;
	}
	//get은 가져오고
	public String getMemberadd1() {
		return add1;
	}
	
	public void setPMemberadd2(String add2) { // get/set 함수
		this.add2 = add2;
	}
	//get은 가져오고
	public String getMemberadd2() {
		return add2;
	}
	
	public void setPMemberssn1(String ssn1) { // get/set 함수
		this.ssn1 = ssn1;
	}
	//get은 가져오고
	public String getMemberssn1() {
		return ssn1;
	}
	
	public void setPMemberssn2(String ssn2) { // get/set 함수
		this.ssn2 = ssn2;
	}
	//get은 가져오고
	public String getMemberssn2() {
		return ssn2;
	}
	public Member() { 
		
	}
	public Member(String name, String zipcode, String address, String add1, String add2, String ssn1, String ssn2, int age) { // 리턴타입이 없음: 생성자
		this.name = name; // this.name은 class Student의 String name을 의미
		this.zipcode = zipcode;
		this.address = address;
		this.add1 = add1;
		this.add2 = add2;
		this.ssn1 = ssn1;
		this.ssn2 = ssn2;
		this.age = age;
	}
	
	public void print() {
		System.out.println("name: " + this.name + "zipcode: " + this.zipcode + "address: " + this.address + "add1: " + this.add1 + "add2: " + this.add2 + "ssn1: " + this.ssn1 + "ssn2: " + this.ssn2 + "age: " + this.age);
	}

}
