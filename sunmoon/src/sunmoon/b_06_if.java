package sunmoon;
import java.util.Scanner; // 입력객체
public class b_06_if {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 생성자의 매개변수, 표준 입력 장치: 키보드
		System.out.println("월을 입력하세요");
		int month = input.nextInt();
		String season = null;
		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} 
		else if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}
		else if(month == 6 || month == 7 || month == 8) {
			season = "여름";
		}
		else if(month == 9 || month == 10 || month == 11) {
			season = "가을";
		}
		else {
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");
		
		// 문제 위의 것을 switch case문을 이용해서 처리해 보세요.
		switch(month) {
		case(12):
		case(1):
		case(2):
			season = "겨울"; break;
		case(3):
		case(4):
		case(5):
			season = "봄"; break;
		case(6):
		case(7):
		case(8):
			season = "여름"; break;
		case(9):
		case(10):
		case(11):
			season = "가을"; break;
		default:
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");
		input.close();// 데이터베이스 접속, 입출력인 경우에 반드시 자원을 해제 시켜 주어야함(메모리 낭비)
	}

}
