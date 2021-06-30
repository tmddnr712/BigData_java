package june0630;

abstract class Exam{
	public static int sum(int x, int y) {
		return (x + y);
	}
	public void print() {}
	public abstract void draw(); //헤더 + body, 위치가 바뀌어도 가능
	abstract public void go();
}





public class c_01_abstract extends Exam{
	public void draw() {};
	public void go() {
		int result = this.sum(10, 20);
		System.out.println("result: " + result);
	}

	public static void main(String[] args) {
		// Exam exam = new Exam();
		c_01_abstract test = new c_01_abstract();
		System.out.println(sum(30,40));
		Exam ex = new c_01_abstract(); // 가리키는 것 가능
		Exam[] ex1 = new Exam[10];// Exam을 실제 인스턴스 하는 것이 아니라: 주소를 넣는 공간을 10칸을 마련하겠다.
		//ex[0] = new Exam();
		ex1[1] = new c_01_abstract();

	}

}
