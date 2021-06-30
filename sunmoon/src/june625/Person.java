package june625;

public class Person {
	String name;
	int age;
	
	public void setPersonName(String name) { // get/set 함수
		this.name = name;
	}
	//get은 가져오고
	public String getPersonName() {
		return name;
	}
	
	public void setPersonAge(int age) { // get/set 함수
		this.age = age;
	}
	//get은 가져오고
	public int getPersonAge() {
		return age;
	}
	
	public Person() { 
		
	}
	public Person(String name, int age) { // 리턴타입이 없음: 생성자
		this.name = name; // this.name은 class Student의 String name을 의미
		this.age = age;
	}
	
	public void print() {
		System.out.println("이름:" + this.name + "나이:" + this.age);
	}

}
//문제 : Person class
//이름(name), 나이(age)를 저장
//멤버함수는 클래스 내의 변수의 값을 출력하는 함수를 작성하고 데이터를 get/set할 수 잇는 함수를 작성하세요
//Person 데이터를 이용해서 대한이 : 10, 민국이 : 11, 만세 : 12 인 데이터를 저장하고 출력하세요.