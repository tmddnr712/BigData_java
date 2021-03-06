package june0630;
// new를 반복적으로 사용하지 않음 => factory class가 대행
interface Inter{
	void methodB();
}

class Inheritance1 implements Inter{
	public void methodB() {
		System.out.println("Interitance1의 함수가 호출되었습니다.(1)");
	}
}

class Inheritance2 implements Inter{
	public void methodB() {
		System.out.println("Interitance2의 함수가 호출되었습니다.(2)");
	}
}


class Inheritance3 implements Inter{
	public void methodB() {
		System.out.println("Interitance3의 함수가 호출되었습니다.(3)");
	}
}

class InstanceManager{
	public static Inter getInstance(int i) {
		if(i == 1)
			return new Inheritance1(); // 1
		else if(i == 2)
			return new Inheritance2(); // 2
		else if(i == 3)
			return new Inheritance3(); // 3
		return null;
	}
}

class Par{
	void methodA(int i) {
		Inter inter = InstanceManager.getInstance(i);
		inter.methodB();		
	}
	Inter makeInter(int i) {
		Inter inter = InstanceManager.getInstance(i);
		return inter;
	}
}

public class c_14_factoryPattern {
	//factory pattern
	public static void main(String[] args) {
		Par par = new Par();
		par.methodA(1);
		par.methodA(2);
		par.methodA(3);
		Inter inter = par.makeInter(1);
		inter.methodB();

	}

}
