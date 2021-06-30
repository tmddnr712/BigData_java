package june625;

public class Person_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps = new Person("대한",10); // 생성자에 따라서
		ps.print();
		Person ps2 = new Person("민국",11); // 생성자에 따라서
		ps2.print();
		Person ps3 = new Person("만세",12); // 생성자에 따라서
		ps3.print();
		
		Person[] pe_dim = new Person[3];
		pe_dim[0] = new Person("대한", 10);
		pe_dim[1] = new Person("민국", 11);
		pe_dim[2] = new Person("만세", 12);
		for(Person pe : pe_dim) {
			pe.print();
		}
		
		String st[] = {"대한", "민국", "만세", "승욱"};
		int age_dim[] = {10, 11, 12, 26};
		Person[] pe_arr = new Person[st.length]; // 사람 수에 맞추어 공간확보
		for(int i = 0; i < st.length; i++) {
			pe_arr[i] = new Person(st[i], age_dim[i]);
		}
		for(Person pe : pe_arr) {
			pe.print();
		}
	}

}
