package july01;

class GenericEx<T>{
	T v[];
	public void set(T[] n) {
		v = n;
	}
	public void print() {
		for(T s:v)
			System.out.println(s);
	}
}

public class a_01_genericprogramming {

	public static void main(String[] args) { // Compiler의 노고
		GenericEx<String> ge = new GenericEx<String>();
		GenericEx<Integer> ge2 = new GenericEx<Integer>();
		GenericEx<Double> ge3 = new GenericEx<Double>();
		String[] ss = {"선문대", "해외", "성공"};
		ge.set(ss);
		ge.print();
		
		Integer[] ss2 = {1,2,3,4};
		ge2.set(ss2);
		ge2.print();
		
		Double[] ss3 = {1.0, 2.0, 3.0, 4.0};
		ge3.set(ss3);
		ge3.print();
	}

}
