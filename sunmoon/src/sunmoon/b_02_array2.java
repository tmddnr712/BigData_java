package sunmoon;

public class b_02_array2 {
	public static void main(String[] args) {
		// ����: �� �л��� ���� ������ {100, 88, 99, 99, 98}�� �迭�� �����ϰ� �հ�� ����� ���
		int[] score =  {100, 88, 99, 99, 98};
		
		int sum = 0;
		sum = score[0] + score[1] + score[2] + score[3] + score[4];
		float avg = 0;
		avg = sum / 5;
		System.out.printf("�հ�� %d�̰� ����� %f�Դϴ�. %n", sum, avg);
		
		
		
		int[] score2 =  {100, 98, 99, 99, 98}; // �Է�
		int sum2 = 0;
		float avg2 = 0f;
		for(int x : score2) { // ó��
			sum2 += x;
		}
		avg2 = sum2 / score2.length;
		System.out.println("�հ�� : " + sum2); // ���
		System.out.println("����� : " + avg2);
		// ��տ� ���� ���� ���(���: ���ǹ�(if, switch), �ݺ���(for, while, do while)
		
		char grade = 'F';
		int ave = (int) avg2 / 10;
		switch(ave) {
		case 10:
			//break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("����: " + grade + "�Դϴ�.");
		
		switch(grade) {//char���� �̿��� ����
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Well Done!");
			break;
		case 'C':
			System.out.println("Good!");
			break;
		case 'D':
			System.out.println("Passed!");
			break;
		case 'F':
			System.out.println("Cheer Up!");
			break;
		default:
			System.out.println("Invalid grade");
		}
	}

}
