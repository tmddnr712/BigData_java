package sunmoon;
// import
public class b_03_math {

	public static void main(String[] args) {// + - * / �� �� ���ָ� ��
		// Math �� class
		// �ν��Ͻ� : static���� ������ �Լ��� ����
		Math.max(5,  10); // �ִ밪
		Math.min(5,  10); // �ּҰ�
		Math.sqrt(64); // ������
		Math.abs(-4.1); // ���밪
		Math.random();
		int randomNum = (int) (Math.random() * 101);
		System.out.println(randomNum);
		System.out.println(Math.pow(10,  3)); // power
		System.out.println(Math.log(28)); // ����, ������, �α�
		System.out.println(Math.exp(3)); // exponent ���� 2.718 ^ 3 // ������
		
		// ����: ȸ��, �ֱ⼺, �ݺ� �ϴ� ������
		// pi : 3.141592, 0 ~ 2pi  
		double b = Math.toRadians(10); // ��ǻ�Ϳ����� ���� / ����(0~360)�� �ƴ� ������ ���
		                               // radian -> angle : toDegrees()
		System.out.println(randomNum);
		
		// �ﰢ�Լ� sin, cos, tan, acos=1/cos, asin=1/sin, atan=1/tan
		System.out.println(Math.sin(b));
		

	}

}
