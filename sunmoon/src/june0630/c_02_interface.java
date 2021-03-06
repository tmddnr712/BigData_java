package june0630;
interface MyInterface{
	public String hello = "인터페이스 변수는 기본으로 public static final 접근이 가능";
	public void sayHello();
}

class MyInterfaceImpl implements MyInterface{
	public void sayHello() {
		System.out.println(MyInterface.hello);
	}
}


public class c_02_interface {

	public static void main(String[] args) {
		System.out.println(MyInterface.hello); // 상수 => class 공간에 저장
		// MyInterface my = new MyInterface();
		MyInterface myinterface = new MyInterfaceImpl(); // 부모 역할 가능
		myinterface.sayHello();
		MyInterface[] mydim = new MyInterface[3];
		mydim[0] = new MyInterfaceImpl();
		mydim[1] = new MyInterfaceImpl();
		//mydim[2] = new MyInterface();

	}

}
