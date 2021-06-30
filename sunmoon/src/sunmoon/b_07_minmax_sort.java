package sunmoon;

public class b_07_minmax_sort {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95}; //최대 최소값 비교
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("최대값: " + max);
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최소값: " + min);
		
		// int형 배열 공간을 확보하고 0부터 9까지 입력해보세요.
		// 배열에 있는 데이터의 순서를 무작위로 변경해 보시오
		int[] list1 = new int[10];
		for(int i = 0; i < list1.length; i++) {
			list1[i] = i;
		}
		for(int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
		System.out.println("\n");
		
		for(int i = 0 ; i < 100; i++) {
			int n = (int) (Math.random() *10);
			
			int temp = list1[0];
			list1[0] = list1[n];
			list1[n] = temp;	
		}
		for(int i = 0; i < list1.length; i++) {
			System.out.print(list1[i]+" ");
		}
		
		// 문제: 정렬해 보시오
		// 검색
		for(int i = 0; i < list1.length; i++) {
			boolean changed = false;
			for(int j = 0; j < list1.length -i -1; j++) {
				if(list1[j] > list1[j + 1]) {
					int temp = list1[j];
					list1[j] = list1[j + 1];
					list1[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		
		// 21.06.23 과제
		// 숫자 알아 맞추기 게임
		// 컴퓨터, 게이머
		// 컴퓨터는 랜덤으로 자기 수를 결정 Random
		// 게이머 : 숫자를 입력 Scanner
		// 비교를 해서 정답인지 오답인지를 출력하면서 계속 반복 : 비교 for, while 문
		// 오답이면 입력한 숫자가 컴퓨터의 숫자보다 큰지 작은지를 출력합니다. 숫자 너무 작다, 너무 크다라는 메시지만 출력
		// 10회가 넘어가면 게이머가 진것으로 합니다. if
		// 과제명_날짜_이름(제출시)
	}

}
