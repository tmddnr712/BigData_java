package sunmoon;

public class b_00_task {

	public static void main(String[] args) {
		// ����: 1���� 10������ ¦���� ���� ���ϰ� ����Ͻÿ�
		int sum = 0;
		for(int i = 0; i < 11; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		// ����: 1���� 10������ Ȧ���� ��
		int sum2 = 0;
		for(int i = 0; i < 11; i++) {
			if(i%2 == 1) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int i = 1; i < 11; i+=2) {
			sum3 += i;
		}
		System.out.println(sum3);
	}

}
