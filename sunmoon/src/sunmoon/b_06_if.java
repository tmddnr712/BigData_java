package sunmoon;
import java.util.Scanner; // �Է°�ü
public class b_06_if {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // �������� �Ű�����, ǥ�� �Է� ��ġ: Ű����
		System.out.println("���� �Է��ϼ���");
		int month = input.nextInt();
		String season = null;
		if(month == 12 || month == 1 || month == 2) {
			season = "�ܿ�";
		} 
		else if(month == 3 || month == 4 || month == 5) {
			season = "��";
		}
		else if(month == 6 || month == 7 || month == 8) {
			season = "����";
		}
		else if(month == 9 || month == 10 || month == 11) {
			season = "����";
		}
		else {
			season = "���� ����";
		}
		System.out.println(month + "����" + season + "�Դϴ�.");
		
		// ���� ���� ���� switch case���� �̿��ؼ� ó���� ������.
		switch(month) {
		case(12):
		case(1):
		case(2):
			season = "�ܿ�"; break;
		case(3):
		case(4):
		case(5):
			season = "��"; break;
		case(6):
		case(7):
		case(8):
			season = "����"; break;
		case(9):
		case(10):
		case(11):
			season = "����"; break;
		default:
			season = "���� ����";
		}
		System.out.println(month + "����" + season + "�Դϴ�.");
		input.close();// �����ͺ��̽� ����, ������� ��쿡 �ݵ�� �ڿ��� ���� ���� �־����(�޸� ����)
	}

}
