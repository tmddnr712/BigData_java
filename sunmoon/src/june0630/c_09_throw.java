package june0630;

public class c_09_throw {
	static void validate(int age) {
		if(age < 18)
			throw new ArithmeticException("�������� �ʽ��ϴ�.");
		else
			System.out.println("��ǥ ���� ����");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch(Exception m) {System.out.println("18������ ��ġ�� �Է� �Ǿ����ϴ�.");}

	}

}
