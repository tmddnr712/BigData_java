package sunmoon;

public class Car {// 파일이름과 일치해야 함, 반드시 인스턴스 해야함
	public String name; // 멤버변수
	public Car(String name) { // 생성자: 리턴값이 없음, 명시적으로 호출이 불가능(자동으로 실행)
		this.name = name;
	}
	public void drive() {
		System.out.println(this.name + "이(가) 달려요");
	}

}
