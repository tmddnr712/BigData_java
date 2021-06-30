package june625;

public class distance {
	int x1;
	int y1;
	int x2;
	int y2;
	
	public void setdistancex1(int x1) { // get/set 함수
		this.x1 = x1;
	}
	//get은 가져오고
	public int getdistancex1() {
		return x1;
	}
	
	public void setdistancey1(int y1) { // get/set 함수
		this.y1 = y1;
	}
	//get은 가져오고
	public int getdistancey1() {
		return y1;
	}
	
	public distance() { 
		
	}
	public distance(int x1, int y1) { // 리턴타입이 없음: 생성자
		this.x1 = x1; // this.name은 class Student의 String name을 의미
		this.y1 = y1;
	}
	
	public float zeroTodistance(int x1, int y1) {
		float result = (0 - this.x1)^2 + (0 - this.y1)^2;
		return result;
	}
}
