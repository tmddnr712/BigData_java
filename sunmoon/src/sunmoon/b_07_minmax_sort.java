package sunmoon;

public class b_07_minmax_sort {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95}; //�ִ� �ּҰ� ��
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("�ִ밪: " + max);
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ּҰ�: " + min);
		
		// int�� �迭 ������ Ȯ���ϰ� 0���� 9���� �Է��غ�����.
		// �迭�� �ִ� �������� ������ �������� ������ ���ÿ�
		int[] list1 = new int[10];
		for(int i = 0; i < list1.length; i++) {
			list1[i] = i;
		}
		for(int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
		System.out.println("\n");
		
		for(int i = 0 ; i < 100; i++) {
			int n = (int) (Math.random() *10);
			
			int temp = list1[0];
			list1[0] = list1[n];
			list1[n] = temp;	
		}
		for(int i = 0; i < list1.length; i++) {
			System.out.print(list1[i]+" ");
		}
		
		// ����: ������ ���ÿ�
		// �˻�
		for(int i = 0; i < list1.length; i++) {
			boolean changed = false;
			for(int j = 0; j < list1.length -i -1; j++) {
				if(list1[j] > list1[j + 1]) {
					int temp = list1[j];
					list1[j] = list1[j + 1];
					list1[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		
		// 21.06.23 ����
		// ���� �˾� ���߱� ����
		// ��ǻ��, ���̸�
		// ��ǻ�ʹ� �������� �ڱ� ���� ���� Random
		// ���̸� : ���ڸ� �Է� Scanner
		// �񱳸� �ؼ� �������� ���������� ����ϸ鼭 ��� �ݺ� : �� for, while ��
		// �����̸� �Է��� ���ڰ� ��ǻ���� ���ں��� ū�� �������� ����մϴ�. ���� �ʹ� �۴�, �ʹ� ũ�ٶ�� �޽����� ���
		// 10ȸ�� �Ѿ�� ���̸Ӱ� �������� �մϴ�. if
		// ������_��¥_�̸�(�����)
	}

}
