package june624;

public class c_06_CallByReference {
	
	public static void swapFunction(int a, int b) {
		System.out.println("교환전, a = " + a + "b = " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("교환후, a = " + a + "b = " + b);
	}
	
	public static void swapFunction(Integer a, Integer b) {
		System.out.println("교환전, a = " + a + "b = " + b);
		Integer c = Integer.valueOf(a);
		a = b;
		b = c;
		System.out.println("교환후, a = " + a + "b = " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 10; // 기본타입 == class 매핑
		String bb = "45"; // 참조형
		// new 없이 진행함
		Integer x = Integer.valueOf(b); // new 생성하면서 주소값을 전달
		Integer y = Integer.valueOf(bb);
		System.out.println("toString(b) = " + Integer.toString(b));
		System.out.println("toHexString(b) = " + Integer.toHexString(b));
		System.out.println("toOctalString(b) = " + Integer.toOctalString(b));
		System.out.println("toBinaryString(b) = " + Integer.toBinaryString(b));
		
		int a1 = 30;
		int b1 = 45;
		System.out.println("교환전, a = " + a1 + "b = " + b1);
		swapFunction(a1, b1);
		System.out.println("교환후, a = " + a1 + "b = " + b1);
		
		Integer aa = Integer.valueOf(30);
		Integer bc = Integer.valueOf(45);
		System.out.println("교환전, a = " + aa + "b = " + bc);
		swapFunction(aa, bc);
		System.out.println("교환후, a = " + aa + "b = " + bc);

	}

}
