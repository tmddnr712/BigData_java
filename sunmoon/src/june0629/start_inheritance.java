package june0629;

class Calculation{
	public int z;
	public void addition(int x, int y) {
		z = x+y;
		System.out.println("합계는: " + z);
	}
	public void subtraction(int x, int y) {
		z = x-y;
		System.out.println("두수의 차: " + z);
	}
}

public class start_inheritance extends Calculation {	
	int z = 20; //27번줄에 영향 , 오버라이딩
	public void multiply(int x, int y) { // 자식클래스 추가
		z = x*y;
		System.out.println("두 수의 곱: " + z);		
	}
	
	
	public static void main(String[] args) {
		int a = 10, b =  20;
		start_inheritance demo = new start_inheritance();
		demo.addition(a, b);
		System.out.println(demo.z);
		demo.subtraction(a, b);
		System.out.println(demo.z);
		demo.multiply(a, b);
	}
	

}
