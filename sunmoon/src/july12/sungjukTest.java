package july12;
import java.util.*;
public class sungjukTest {



	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int cmdNo = 0;



		while (true) {

			System.out.println("");

			System.out.println("���ϴ� �޴��� �����Ͻʽÿ�.");

			System.out.println("1.��ȸ 2.���� 3.���� 4.�Է� 5.����");

			cmdNo = scan.nextInt();



			if (cmdNo == 1) {

				sungjuk_Select select = new sungjuk_Select(); // ��ȸ Ŭ������ ��ü ����

				select.selectMethod(); // ��ȸ Ŭ������ ��ȸ �޼ҵ� ����

			}

			else if (cmdNo == 2) {

				sungjuk_Update update = new sungjuk_Update(); // ���� Ŭ������ ��ü ����

				update.updateMethod(); // ���� Ŭ������ ���� �޼ҵ� ����

			}

			else if (cmdNo == 3) {

				sungjuk_Delete delete = new sungjuk_Delete(); // ���� Ŭ������ ��ü ����

				delete.deleteMethod(); // ���� Ŭ������ ���� �޼ҵ� ����

			}

			else if (cmdNo == 4) {

				sungjuk_Insert insert = new sungjuk_Insert(); // �Է� Ŭ������ ��ü ����

				insert.insertMethod(); // �Է� Ŭ������ �Է� �޼ҵ� ����

			}

			else {

				scan.close();

			break;

			}			

		}

	}

}