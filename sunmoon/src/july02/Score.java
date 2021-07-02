package july02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Score{
	int people;
	Scanner sc;
	HashMap<Integer, Student> stu;
	int number=0;

	Score() {
		sc = new Scanner(System.in);
		stu = new HashMap<Integer, Student>();
	}

	public void Input(Student st) {
		sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���");
		String name = sc.next();
		st.setName(name);

		System.out.println(name + "�� ���� ������ �Է����ּ���");
		int kor = sc.nextInt();
		st.setKor(kor);

		System.out.println(name + "�� ���� ������ �Է����ּ���");
		int eng = sc.nextInt();
		st.setEng(eng);

		System.out.println(name + "�� ���� ������ �Է����ּ���");
		int mat = sc.nextInt();
		st.setMat(mat);

		st.setSum(kor, eng, mat);
		st.result();

		stu.put(number,st);
		
		number = number+1;
	}

	public void Output() {

		Set<Integer> keySet = stu.keySet();
		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {
		    int key = iterator.next();

		    System.out.print(" �̸� :" + stu.get(key).getName());
		    System.out.print(" ���� :" + stu.get(key).getKor());
	       	    System.out.print(" ���� :" + stu.get(key).getEng());
		    System.out.print(" ���� :" + stu.get(key).getMat());
		    System.out.print(" ���� :" + stu.get(key).getSum());
		    System.out.print(" ��� :" + stu.get(key).getAvg());
		    System.out.println(" ");
		}
	}

	public void Modify() {

	    System.out.println("������ �����Ͻðڽ��ϱ�?");
	    String name = sc.next();

	    Set<Integer> keySet = stu.keySet();
	    Iterator<Integer> iterator = keySet.iterator();

	    while (iterator.hasNext()) {
		int key = iterator.next();

		if (name.equals(stu.get(key).getName())) {
		    System.out.println(stu.get(key).getName() + "���� �ٲ� ������� �Է����ּ���");
		    int kor = sc.nextInt();
		    stu.get(key).setKor(kor);

		    System.out.println(stu.get(key).getName() + "���� �ٲ� ������� �Է����ּ���");
		    int eng = sc.nextInt();
		    stu.get(key).setEng(eng);

		    System.out.println(stu.get(key).getName() + "���� �ٲ� ���м����� �Է����ּ���");
		    int mat = sc.nextInt();
		    stu.get(key).setMat(mat);
		    stu.get(key).setSum(kor, eng, mat);
		    stu.get(key).result();
		}
	   }
    }

    public void Delete() {
	System.out.println("������ �����Ͻðڽ��ϱ�?");
	String name = sc.next();

	for (int i = 0; i < stu.size(); i++) {
	    if (name.equals(stu.get(i).getName())) {
		stu.remove(i);
		}
      	  }
    }
}