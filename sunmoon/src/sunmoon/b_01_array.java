package sunmoon;

public class b_01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 11, 45, 9}; // ������ �����Ͱ� ������ �޸� ������ ����(heap)
		for(int num : arr) {
			System.out.println(num);
		}
		int[] a = new int[4]; // �ʱ� �����Ͱ� ���� ��� => ������ �Ҵ�(0 ~ 3)
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		//a[4] = 100;
		int sum = 0;
		sum = a[0] + a[1] + a[2] + a[3]; // data read
		System.out.printf("�迭�� ������ %d�Դϴ�. %n", sum); // % ���ڿ�d decimal, f:float, c: char, s: string
		
		int[] b = {1000, 2000, 3000, 4000}; // �����͸� ���(����)
		for(int num2 : b) {
			System.out.println(num2);
		}
		
		// Ŭ������ ����(�������) + �Լ�(����Լ�)
		for(int i = 0; i < b.length; i++) { //�������
			System.out.println(b[i]);
		}
	}

}
