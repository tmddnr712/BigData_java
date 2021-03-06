package june0629;

class Parent{
	int x = 100;
	public void setvalue(int x) {
		this.x = x;
	}
	void method() {
		System.out.println("부모함수");
	}
}

class Child extends Parent {
	int x = 200;
	Child(){x = 1000;}
	public void setvalue(int x) {this.x = x;} // 오버라이딩
	void method() {System.out.println("자식 제1함수: " + x);} // 오버라이딩
	void method2() {System.out.println("자식 제2함수: " + x);} // 추가
}

class Child2 extends Parent {
	int x = 300;
	Child2(){x = 2000;} // 인스턴스가 할 때 실행
	public void setvalue(int x) {this.x = x;} // 오버라이딩
	void method() {System.out.println("자식 제2-1함수: " + x);} // 오버라이딩
	void method3() {System.out.println("자식 제2-2함수: " + x);} // 추가
}


public class inheritance2 {

	public static void main(String[] args) { // design pattern을 기본적으로 사용 않는 프로그램은 없음
		Child c = new Child(); // 기본은 변수 데이터타입하고 데이터의 데이터 타입이 일치
		Parent p = new Child();// 불일치 => 문법적으로 인정
		//Parent p = (Parent) new Child(); // 원래는 (Parent) 해줘야함
		c.method();
		p.method(); // 재정의 했기 때문에
		c.method2();
		//p.method2();// 부모가 자식을 대신해서 가리킬 때는 부모에 있는 것만 실행이 가능
		
		Child d= (Child) p;// downcasting
		d.method2();
		// 부모 클래스 배열을 사용하기 위함
		Child ch[] = new Child[3]; // 주소가 저장되는 공간이 힙에
		for(int i = 0; i < 3; i++) {
			ch[i] = new Child(); // 힙에 공간을 만들고 주소를 배열에 저장
		}
		ch[0].setvalue(100);
		ch[0].setvalue(20);
		ch[0].setvalue(10);
		for(int i = 0; i < 3; i++) { // 자료구조
			ch[i].method();
		}
		
		
		Parent chp[] = new Parent[6];
		for(int i = 0; i < 3; i++) { // 이질적 데이터를 부모가 담고 있음
			chp[i] = new Child();
		}
		for(int i = 3; i < 6; i++) {
			chp[i] = new Child2();
		}
		for(int i = 0; i < 6; i++) {
			chp[i].method();
		}
		
		// 추가된 함수를 호출하는 경우
		Child ch1[] = new Child[3];
		Child2 ch2[] = new Child2[3];
		for(int i = 0; i< 3; i++) {
			ch1[i] = (Child) chp[i];
			ch1[i].method2();
		}
		for(int i = 3; i< 6; i++) {
			ch2[i] = (Child2) chp[i];
			ch2[i].method3();
		}
		
	}

}
