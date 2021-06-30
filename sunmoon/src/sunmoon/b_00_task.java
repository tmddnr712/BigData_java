package sunmoon;

public class b_00_task {

	public static void main(String[] args) {
		// 문제: 1부터 10까지의 짝수의 합을 구하고 출력하시오
		int sum = 0;
		for(int i = 0; i < 11; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		// 문제: 1부터 10까지의 홀수의 합
		int sum2 = 0;
		for(int i = 0; i < 11; i++) {
			if(i%2 == 1) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int i = 1; i < 11; i+=2) {
			sum3 += i;
		}
		System.out.println(sum3);
	}

}
