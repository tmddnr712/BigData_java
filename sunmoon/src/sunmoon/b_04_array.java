package sunmoon;

public class b_04_array {
	public static void main(String[] args) {
		int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		// 1,2,3    4 x 3 �迭
		// 4,5,6 
		// 7,8,9 
		// 10,11,12
		for(int i = 0; i < 4; i++) {//��          0       1       2       3
			for(int j =0; j < 3; j++) {//��  0,1,2   0,1,2   0,1,2   0,1,2
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println(); // enter�� ȿ��
		}
		//����: ���� �迭�� �ִ� ���ڿ� ��� 10�� ���غ�����. tip: arr[i][j] = arr[i][j] * 10;
		for(int i = 0; i < 4; i++) {//��          0       1       2       3
			for(int j =0; j < 3; j++) {//��  0,1,2   0,1,2   0,1,2   0,1,2
				System.out.print(arr2[i][j]*10 + " ");
			}
			System.out.println(); // enter�� ȿ��
		}
		
		// ����
		// 1 2 3
		// 2 3 4
		// 3 4 5
		int[][] arr3 = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				arr3[i][j] = i + j + 1;
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr4 = new int[3][]; // ���� ������ �ȵ� ���
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[2];
		int count = 1;
		for(int i = 0; i < arr4.length; i++) {// ��
			for(int j =0; j < arr4[i].length; j++) {//��
				arr4[i][j] = count++;
			}
			System.out.println();
		}
		for(int i = 0; i < arr4.length; i++) {//��
			for(int j =0; j < arr4[i].length; j++) {//��
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		// function:
		// String�� ��ü class = ��� ���� + ����Լ�(method) : ����������
		String[] names = new String[3]; // immutable ������ �Ұ����ϴ�. // ���ڿ���1�����迭�� ���� 2�����迭�� ����.
		names[0] = "õ�Ƚ�"; // ���ڿ��� ��ü�� ���ڹ迭
		names[1] = "�����";
		names[2] = "������";
		
		String[] names2 = {"õ�Ƚ�", "�����", "������"};
		for(int i = 0; i < names2.length; i++) {
			System.out.print(names2[i] + "\n");
		}
		
		// ������ ����: �迭, ���ڿ�(String), ��ü �迭(class �迭)
		// �������(Ŭ�������� ������ �Ҵ�), ����Լ� �������� ���(�ѹ��� �޸𸮸� ������)
		// Car[] : ������ Ÿ��
		// cars : ���� = �迭 ������ ���� �ּҰ�
		Car[] cars = new Car[3]; // �޸�, ��ü == ������ ����
		cars[0] = new Car("�ҳ�Ÿ"); //��������� ���Ͽ� ���� �������� �Ҵ�
		cars[1] = new Car("�ƹ���");
		cars[2] = new Car("�ƿ��");
		for(int i = 0; i < cars.length; i++) {
			cars[i].drive();
		}
		
	}
}
