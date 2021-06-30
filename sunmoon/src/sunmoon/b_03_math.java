package sunmoon;
// import
public class b_03_math {

	public static void main(String[] args) {// + - * / 만 잘 해주면 됨
		// Math 도 class
		// 인스턴스 : static으로 구서된 함수의 집단
		Math.max(5,  10); // 최대값
		Math.min(5,  10); // 최소값
		Math.sqrt(64); // 제곱근
		Math.abs(-4.1); // 절대값
		Math.random();
		int randomNum = (int) (Math.random() * 101);
		System.out.println(randomNum);
		System.out.println(Math.pow(10,  3)); // power
		System.out.println(Math.log(28)); // 지수, 제곱근, 로그
		System.out.println(Math.exp(3)); // exponent 지수 2.718 ^ 3 // 지면대수
		
		// 각도: 회전, 주기성, 반복 하는 데이터
		// pi : 3.141592, 0 ~ 2pi  
		double b = Math.toRadians(10); // 컴퓨터에서는 라디안 / 각도(0~360)가 아닌 라디안을 사용
		                               // radian -> angle : toDegrees()
		System.out.println(randomNum);
		
		// 삼각함수 sin, cos, tan, acos=1/cos, asin=1/sin, atan=1/tan
		System.out.println(Math.sin(b));
		

	}

}
