package june625;

public class Person {
	String name;
	int age;
	
	public void setPersonName(String name) { // get/set �Լ�
		this.name = name;
	}
	//get�� ��������
	public String getPersonName() {
		return name;
	}
	
	public void setPersonAge(int age) { // get/set �Լ�
		this.age = age;
	}
	//get�� ��������
	public int getPersonAge() {
		return age;
	}
	
	public Person() { 
		
	}
	public Person(String name, int age) { // ����Ÿ���� ����: ������
		this.name = name; // this.name�� class Student�� String name�� �ǹ�
		this.age = age;
	}
	
	public void print() {
		System.out.println("�̸�:" + this.name + "����:" + this.age);
	}

}
//���� : Person class
//�̸�(name), ����(age)�� ����
//����Լ��� Ŭ���� ���� ������ ���� ����ϴ� �Լ��� �ۼ��ϰ� �����͸� get/set�� �� �մ� �Լ��� �ۼ��ϼ���
//Person �����͸� �̿��ؼ� ������ : 10, �α��� : 11, ���� : 12 �� �����͸� �����ϰ� ����ϼ���.