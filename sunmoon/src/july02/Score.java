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
		
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		st.setName(name);

		System.out.println(name + "의 국어 성적을 입력해주세요");
		int kor = sc.nextInt();
		st.setKor(kor);

		System.out.println(name + "의 영어 성적을 입력해주세요");
		int eng = sc.nextInt();
		st.setEng(eng);

		System.out.println(name + "의 수학 성적을 입력해주세요");
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

		    System.out.print(" 이름 :" + stu.get(key).getName());
		    System.out.print(" 국어 :" + stu.get(key).getKor());
	       	    System.out.print(" 영어 :" + stu.get(key).getEng());
		    System.out.print(" 수학 :" + stu.get(key).getMat());
		    System.out.print(" 총점 :" + stu.get(key).getSum());
		    System.out.print(" 평균 :" + stu.get(key).getAvg());
		    System.out.println(" ");
		}
	}

	public void Modify() {

	    System.out.println("누구를 수정하시겠습니까?");
	    String name = sc.next();

	    Set<Integer> keySet = stu.keySet();
	    Iterator<Integer> iterator = keySet.iterator();

	    while (iterator.hasNext()) {
		int key = iterator.next();

		if (name.equals(stu.get(key).getName())) {
		    System.out.println(stu.get(key).getName() + "님의 바뀐 국어성적을 입력해주세요");
		    int kor = sc.nextInt();
		    stu.get(key).setKor(kor);

		    System.out.println(stu.get(key).getName() + "님의 바뀐 영어성적을 입력해주세요");
		    int eng = sc.nextInt();
		    stu.get(key).setEng(eng);

		    System.out.println(stu.get(key).getName() + "님의 바뀐 수학성적을 입력해주세요");
		    int mat = sc.nextInt();
		    stu.get(key).setMat(mat);
		    stu.get(key).setSum(kor, eng, mat);
		    stu.get(key).result();
		}
	   }
    }

    public void Delete() {
	System.out.println("누구를 삭제하시겠습니까?");
	String name = sc.next();

	for (int i = 0; i < stu.size(); i++) {
	    if (name.equals(stu.get(i).getName())) {
		stu.remove(i);
		}
      	  }
    }
}