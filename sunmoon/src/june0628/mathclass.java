package june0628;

import java.util.Scanner;

class Mymath {
	Scanner input;
	Mymath(){
		calc();
	}
	long calc() {
		input = new Scanner(System.in);
		System.out.println("첫번째 operand를 입력하세요.");
		long lo1 = input.nextInt();
		System.out.println("두번째 operand를 입력하세요.");
		long lo2 = input.nextInt();
		return add(lo1, lo2);
		
	}
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	}
	
	long multiply(long a, long b) {
		long result = a * b;
		return result;
	}
	
	long divide(long a, long b) {
		long result = a / b;
		return result;
	}


}
public class mathclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymath mm = new Mymath();
		long result1 = mm.add(5L, 3L);
		System.out.println("add(5L, 3L) = " + result1);
		
		System.out.println(mm.calc());
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 operand 입력하세요.");
		long lo1 = input.nextInt();
		System.out.println("첫번째 operand 입력하세요.");
		long lo2 = input.nextInt();
		mm.add(lo1,  lo2);
		//Mymath.add(lo1, lo2); 

	}

}