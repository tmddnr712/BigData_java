package june625;
// �޸𸮸� ȿ�������� ����ؾ���
// ó�� �ӵ��� ���
public class d_04_scope {
	int z = 100;
	static int t = 200;
	public d_04_scope(int z) {
		this.z = z;
	}
	public static void main(String[] args) {
		int x = 100;
		// TODO Auto-generated method stub
		System.out.println(x);
		{
			int y = 100;
			System.out.println(y);
		}
		System.out.println(t);
	}
	d_04_scope d = new d_04_scope(100);
}

// ���� : 
// �ּҷ� class : Member
// name, zipcode, address, add1, add2, ssn1, ssn2, age�� ������ ����
// ������ 123-456, '����', '���α�', '11111', '1111118', 20