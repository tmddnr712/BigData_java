package june0630;
import java.util.InputMismatchException;
import java.util.Scanner;
public class c_10_inputException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("첫수 입력(정수):");
			int num1 = scan.nextInt();
			System.out.print("피젯수 입력(정수):");
			int num2 = scan.nextInt();
			int mog = num2 / num1;
			int na = num2 % num1;
			
			System.out.println(num2 + "를" + num1 + "으로 나눈 몫" + mog);
			System.out.println(num2 + "를" + num1 + "으로 나눈 나머지" + na);
		}
		catch(InputMismatchException ime) { // ctrl + shift + o 자동으로 import
			System.out.println("숫자 형식으로 입력하세요");
		}
		catch(ArithmeticException ie) {
			System.out.println("어떤수를 0으로 나눌 수 없어요");
		}
		catch(Exception e) {
			System.out.println("Exception 발생!");
			System.out.println("예외 정보:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");

	}

}
