package june625;

public class Person_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps = new Person("����",10); // �����ڿ� ����
		ps.print();
		Person ps2 = new Person("�α�",11); // �����ڿ� ����
		ps2.print();
		Person ps3 = new Person("����",12); // �����ڿ� ����
		ps3.print();
		
		Person[] pe_dim = new Person[3];
		pe_dim[0] = new Person("����", 10);
		pe_dim[1] = new Person("�α�", 11);
		pe_dim[2] = new Person("����", 12);
		for(Person pe : pe_dim) {
			pe.print();
		}
		
		String st[] = {"����", "�α�", "����", "�¿�"};
		int age_dim[] = {10, 11, 12, 26};
		Person[] pe_arr = new Person[st.length]; // ��� ���� ���߾� ����Ȯ��
		for(int i = 0; i < st.length; i++) {
			pe_arr[i] = new Person(st[i], age_dim[i]);
		}
		for(Person pe : pe_arr) {
			pe.print();
		}
	}

}
