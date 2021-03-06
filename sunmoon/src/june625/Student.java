package june625;

// this는 멤버변수와 매개변수를 구분하기 위해서 사용
// 메모리의 있는 데이터를 다른 매개변수로 전달하기 위해서 사용
public class Student {
	String name;
	int kor;
	int mat;
	int eng;
	//set은 설정
	public void setStudentName(String name) { // get/set 함수
		this.name = name;
	}
	//get은 가져오고
	public String getStudentName() {
		return name;
	}
	// 디폴트 생성자
	// 생성자 오버로딩을 하면 디폴트 생성자가 자동으로 생성되지 않음
	// 생성자는 리턴타입이 없음
	public Student() { 
		
	}
	public Student(String name, int kor, int mat, int eng) { // 리턴타입이 없음: 생성자
		this.name = name; // this.name은 class Student의 String name을 의미
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	public Student(String name, int kor, int mat) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = 95;
	}
	public Student(String name, int kor) {
		this.name = name;
		this.kor = kor;
		this.mat = 90;
		this.eng = 90;
	}
	public void print() {
		System.out.println("이름:" + name + "국어:" + kor + "수학:" + mat + "영어:" + eng);
	}
}
