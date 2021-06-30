package sunmoon;

public class b_01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 11, 45, 9}; // 동질적 데이터가 연속적 메모리 공간에 저장(heap)
		for(int num : arr) {
			System.out.println(num);
		}
		int[] a = new int[4]; // 초기 데이터가 없는 경우 => 공간만 할당(0 ~ 3)
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		//a[4] = 100;
		int sum = 0;
		sum = a[0] + a[1] + a[2] + a[3]; // data read
		System.out.printf("배열의 총합은 %d입니다. %n", sum); // % 문자열d decimal, f:float, c: char, s: string
		
		int[] b = {1000, 2000, 3000, 4000}; // 데이터를 출력(과제)
		for(int num2 : b) {
			System.out.println(num2);
		}
		
		// 클래스는 변수(멤버변수) + 함수(멤버함수)
		for(int i = 0; i < b.length; i++) { //멤버변수
			System.out.println(b[i]);
		}
	}

}
