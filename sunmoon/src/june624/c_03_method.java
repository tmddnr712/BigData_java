package june624;
// 클래스는 인스턴스 : 
public class c_03_method { // 클래스 = 멤버변수 + 멤버함수
	/*int b;
	int c;
	// 접근지정자
	public static void main(String[] args) {
		System.out.println("프로그램 시작 첫 함수 호출");
		staticMethod1();
		staticMethod1();
		System.out.println("메인으로 복귀");
		System.out.println("종료합니다.");
	}
	
	public static void staticMethod1() { // block은 중괄호{}, 함수는 소괄호(), 배열은 대괄호[]
		int a = 10;
		System.out.println("첫 함수 진입");
		staticMethod2();
		System.out.println("두번째 함수 호출 종료");
	}
	public static void staticMethod2() {
		System.out.println("두번째 함수 진입");
		System.out.println("두번째 함수 호출 종료");
	}*/
	
	//문제 : y = ax^2 + bx + c 라는 함수를 method로 구현하고
	// a = 2, b=4, c=1, 일때 x = 2라면 어떤 값이 리턴되는지 확인해 보세요.
	public static void main(String[] args) { // 함수호출
		int a = 2; int b = 4; int c = 1; int x = 2;
		System.out.println(func(a, b, c, x));
	}
	
	public static int func(int a, int b, int c, int x) { // 함수정의
		int y = (a * x ^ 2) + (b * x) + c;
		return y;
	}
}

// public 접근지정자, 