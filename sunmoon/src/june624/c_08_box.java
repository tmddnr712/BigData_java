package june624;

public class c_08_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����: ����, ����, ���̸� �Է� �޾� ���Ǹ� ����ϴ� �Լ��� �ۼ��ϰ�
		// ����:10, ����:20, ����:30 �� �ڽ��� ���Ǹ� ����ϼ���
		int width = 10; int length = 20; int height = 30;
		System.out.println(volume(width, length, height));

	}
	
	public static int volume(int width, int length, int height) {
		int result = width * length * height;
		return result;
	}

}
