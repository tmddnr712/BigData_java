package july12;
import java.util.*;
public class sungjukTest {



	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int cmdNo = 0;



		while (true) {

			System.out.println("");

			System.out.println("원하는 메뉴를 선택하십시오.");

			System.out.println("1.조회 2.수정 3.삭제 4.입력 5.종료");

			cmdNo = scan.nextInt();



			if (cmdNo == 1) {

				sungjuk_Select select = new sungjuk_Select(); // 조회 클래스의 객체 생성

				select.selectMethod(); // 조회 클래스의 조회 메소드 실행

			}

			else if (cmdNo == 2) {

				sungjuk_Update update = new sungjuk_Update(); // 수정 클래스의 객체 생성

				update.updateMethod(); // 수정 클래스의 수정 메소드 실행

			}

			else if (cmdNo == 3) {

				sungjuk_Delete delete = new sungjuk_Delete(); // 삭제 클래스의 객체 생성

				delete.deleteMethod(); // 삭제 클래스의 삭제 메소드 실행

			}

			else if (cmdNo == 4) {

				sungjuk_Insert insert = new sungjuk_Insert(); // 입력 클래스의 객체 생성

				insert.insertMethod(); // 입력 클래스의 입력 메소드 실행

			}

			else {

				scan.close();

			break;

			}			

		}

	}

}