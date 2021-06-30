// 성적
// 이름, 국어, 수학, 영어, 총점, 평균
// get/set 함수, 총점계산, 평균계산함수(소수점 이하 2자리에서 반올림)
// 클래스 내부에 있는 데이터를 display함수로 출력

// main class 에서
// 클래스 배열을 만들고 5명의 데이터를 입력
// 국어 영어 수학의 반합계와 반평균도 구하기
// 개인별 합계를 합계하여 반합계 구함,
// 반 평균을 구해서 출력

// 받아야 되는게 이름, 국어, 영어, 수학(get, set)
// 총점계산, 평균계산(display 함수)
package june625;

public class project1 {
	String name;
	int kor;
	int math;
	int eng;
	
	public void setName(String name) { // 이름
		this.name = name;
	}
	//get은 가져오고
	public String getName() {
		return name;
	}
	
	public void setKor(int kor) { // 국어점수
		this.kor = kor;
	}
	//get은 가져오고
	public int getKor() {
		return kor;
	}
	
	public void setMath(int math) { // 수학점수
		this.math = math;
	}
	//get은 가져오고
	public int getMath() {
		return math;
	}
	
	public void setEng(int eng) { // 영어점수
		this.eng = eng;
	}
	//get은 가져오고
	public int getEng() {
		return eng;
	}
	
	public project1() { 
		
	}
	public project1(String name, int kor, int math, int eng) { // 리턴타입이 없음: 생성자
		this.name = name; // this.name은 class Student의 String name을 의미
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
}

