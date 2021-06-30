package june624;
import java.util.Scanner;
public class c_02_odd_even {

	public static void main(String[] args) {
		int count = 0; int win = 0; int loss = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("종료를 원하면 9를 입력하세요.");
		
		for( ; ; ) {
			System.out.println("0(짝), 1(홀)을 입력하세요.");
			int person = Integer.parseInt(scan.nextLine());
			if(person == 9) break; // 종료조건
			int com = (int) (Math.random() *  2);
			
			if(person % 2 == com) {
				win += 1;
				System.out.println("맞추었습니다.");
			}
			else {
				loss += 1;
				System.out.println("틀렸습니다(오백원).");
			}
			count += 1;
		}
		System.out.println("총게임횟수는 = " + count + "전:" + win + "승:" + loss + "패 입니다.");

	}

}
