package june0630;
import java.util.InputMismatchException;
import java.util.Scanner;
public class c_10_inputException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("ù�� �Է�(����):");
			int num1 = scan.nextInt();
			System.out.print("������ �Է�(����):");
			int num2 = scan.nextInt();
			int mog = num2 / num1;
			int na = num2 % num1;
			
			System.out.println(num2 + "��" + num1 + "���� ���� ��" + mog);
			System.out.println(num2 + "��" + num1 + "���� ���� ������" + na);
		}
		catch(InputMismatchException ime) { // ctrl + shift + o �ڵ����� import
			System.out.println("���� �������� �Է��ϼ���");
		}
		catch(ArithmeticException ie) {
			System.out.println("����� 0���� ���� �� �����");
		}
		catch(Exception e) {
			System.out.println("Exception �߻�!");
			System.out.println("���� ����:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");

	}

}
