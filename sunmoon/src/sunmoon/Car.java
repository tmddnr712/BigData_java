package sunmoon;

public class Car {// �����̸��� ��ġ�ؾ� ��, �ݵ�� �ν��Ͻ� �ؾ���
	public String name; // �������
	public Car(String name) { // ������: ���ϰ��� ����, ��������� ȣ���� �Ұ���(�ڵ����� ����)
		this.name = name;
	}
	public void drive() {
		System.out.println(this.name + "��(��) �޷���");
	}

}
