package june625;

public class circle {
	public point po; // 클래스는 참조형
	public double radius;
	public point getPo() {
		return po;
	}
	public void setPo(point po) {
		this.po = po;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public circle() {}
	public circle(point po, double radius) {
		this.po = po;
		this.radius = radius;
	}
	public boolean getCollision(circle cir) {
		double tot_radius = this.radius + cir.radius;
		double dist = po.distanceTo(cir.po);
		if(dist < tot_radius)
			return true;
		else
			return false;
	}
	
	
	

}
// 과제: 가위바위보를 클래스로 구현
// 성적
// 이름, 국어, 수학, 총점, 평균
// get/set 함수, 총점계산, 평균계산함수(소수점 이하 2자리에서 반올림)
// 클래스 내부에 있는 데이터를 display함수로 출력

// main class 에서
// 클래스 배열을 만들고 5명의 데이터를 입력
// 국어 영어 수학의 반합계와 반평균도 구하기
// 개인별 합계를 합계하여 반합계 구함,
// 반 평균을 구해서 출력