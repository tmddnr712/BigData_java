package june0629;

class Super_class{
	int num = 20;
	public void display() {
		System.out.println("슈퍼클래스에서 출력");
	}
}

public class overriding extends Super_class{
	int num = 10;
	public void display() { // 재정의 하면 자식의 메소드 우선함
		System.out.println("슈퍼클래스에서 출력");
	}
	public void my_method() { // 추가
		overriding sub = new overriding();
		sub.display(); // 자식의 메소드 호출
		super.display(); // 자위에 Super_class의 display()를 호출하고 싶으면 super를 붙여준다.
		display();
		System.out.println("자식의 변수: " + sub.num);
		System.out.println("부모의 변수: " + super.num);
		System.out.println("자식의 변수: " + num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
