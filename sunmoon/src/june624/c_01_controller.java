package june624;
import java.util.Scanner; 

public class c_01_controller {

	public static void main(String[] args) {
		/*int number = -13;
		// 0:false, 1이상:true
		if(number > 0) {
			System.out.println("POSITIVE");
		}
		else if(number < 0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("ZERO");
		}*/
		
		/*
		// 문제
		// 숫자로 월을 입력(1~12)을 받고 이를 영문 월로 매핑해서 출력하시오(switch문 사용)
		// 인스턴스 변수
		// 클래스는 사용자정의 데이터타입 : 클래스는 참조형 변수
		// new : 동적 메모리 할당(heap)
		Scanner sca = new Scanner(System.in); // 표준입력장치(키보드) in/out(표준입력장치:모니터)
		// 데이터 입출력은 문자열
		int month = sca.nextInt(); // intgud 데이터 입력
		String monthString = "";
		
		switch(month) {
		case 1: monthString = "January"; break;
		case 2: monthString = "February"; break;
		case 3: monthString = "March"; break;
		case 4: monthString = "April"; break;
		case 5: monthString = "May"; break;
		case 6: monthString = "June"; break;
		case 7: monthString = "July"; break;
		case 8: monthString = "August"; break;
		case 9: monthString = "September"; break;
		case 10: monthString = "October"; break;
		case 11: monthString = "Novmber"; break;
		case 12: monthString = "December"; break;
		default:
			System.out.println("잘못된 월입니다.");
		}
		System.out.println(monthString);
		*/
		
		// 반복문과 break, continue
		for(int i = 1; i <= 3; i++) {//외부
			for(int j = 1; j <= 3; j++) {//내부
				//if(i == 2 && j ==2) {
					//break;
				//}
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("");
		for(int i = 1; i <= 3; i++) {//외부
			for(int j = 1; j <= 3; j++) {//내부
				if(i == 2 && j ==2) {
					break; // 반복문을 조건에서 중지
				}
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("");
		for(int i = 1; i <= 3; i++) {//외부
			for(int j = 1; j <= 3; j++) {//내부
				if(i == 2 && j ==2) {
					continue; // 작업을 하지않고 다음 for문으로 진행
				}
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("");
		aa: for(int i = 1; i <= 3; i++) {//외부
			bb : for(int j = 1; j <= 3; j++) {//내부
				if(i == 2 && j ==2) {
					break aa; //
				}
				System.out.println(i + " " + j);
			}
		}
		
		
	}

}
