package sunmoon;

public class b_02_array2 {
	public static void main(String[] args) {
		// 문제: 한 학생의 과목별 점수는 {100, 88, 99, 99, 98}을 배열에 저장하고 합계와 평균을 출력
		int[] score =  {100, 88, 99, 99, 98};
		
		int sum = 0;
		sum = score[0] + score[1] + score[2] + score[3] + score[4];
		float avg = 0;
		avg = sum / 5;
		System.out.printf("합계는 %d이고 평균은 %f입니다. %n", sum, avg);
		
		
		
		int[] score2 =  {100, 98, 99, 99, 98}; // 입력
		int sum2 = 0;
		float avg2 = 0f;
		for(int x : score2) { // 처리
			sum2 += x;
		}
		avg2 = sum2 / score2.length;
		System.out.println("합계는 : " + sum2); // 출력
		System.out.println("평균은 : " + avg2);
		// 평균에 따라 학점 출력(제어문: 조건문(if, switch), 반복문(for, while, do while)
		
		char grade = 'F';
		int ave = (int) avg2 / 10;
		switch(ave) {
		case 10:
			//break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점: " + grade + "입니다.");
		
		switch(grade) {//char형을 이용한 조건
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Well Done!");
			break;
		case 'C':
			System.out.println("Good!");
			break;
		case 'D':
			System.out.println("Passed!");
			break;
		case 'F':
			System.out.println("Cheer Up!");
			break;
		default:
			System.out.println("Invalid grade");
		}
	}

}
