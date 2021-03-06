package june624;

public class c_07_array {
	public static void m() {} // 매개변수가 없는 것도 overloading으로 구분해 줌
	public static void m(int i) { i = 99; }
	public static void m(int[] arr) { arr[0] = 99; arr[1] = 990;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		int i = 10;
		m(i); // 값으로 전달되기 때문에 call by reference 불변
		System.out.println(i);
		
		int[] arr = {10, 20, 30}; // 배열도 클래스 -> 변수가 주소값을 저장
		m(arr);
		System.out.println(arr[0]); // 주소로 전달 된 것은 원본에 영향을 미침
		System.out.println(arr[1]);
		System.out.println(arr[2]); // 위에 선언 안되어 있으면 main값을 가져옴
		System.out.println(arr.length);
	}

}
