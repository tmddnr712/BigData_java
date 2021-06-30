package sunmoon;

public class b_04_array {
	public static void main(String[] args) {
		int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		// 1,2,3    4 x 3 배열
		// 4,5,6 
		// 7,8,9 
		// 10,11,12
		for(int i = 0; i < 4; i++) {//행          0       1       2       3
			for(int j =0; j < 3; j++) {//열  0,1,2   0,1,2   0,1,2   0,1,2
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println(); // enter의 효과
		}
		//문제: 위의 배열에 있는 숫자에 모두 10을 곱해보세요. tip: arr[i][j] = arr[i][j] * 10;
		for(int i = 0; i < 4; i++) {//행          0       1       2       3
			for(int j =0; j < 3; j++) {//열  0,1,2   0,1,2   0,1,2   0,1,2
				System.out.print(arr2[i][j]*10 + " ");
			}
			System.out.println(); // enter의 효과
		}
		
		// 문제
		// 1 2 3
		// 2 3 4
		// 3 4 5
		int[][] arr3 = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				arr3[i][j] = i + j + 1;
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr4 = new int[3][]; // 열이 결정이 안된 경우
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[2];
		int count = 1;
		for(int i = 0; i < arr4.length; i++) {// 행
			for(int j =0; j < arr4[i].length; j++) {//열
				arr4[i][j] = count++;
			}
			System.out.println();
		}
		for(int i = 0; i < arr4.length; i++) {//행
			for(int j =0; j < arr4[i].length; j++) {//열
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		// function:
		// String이 객체 class = 멤버 변수 + 멤버함수(method) : 접근지정자
		String[] names = new String[3]; // immutable 수정이 불가능하다. // 문자열은1차원배열이 숫자 2차원배열과 같다.
		names[0] = "천안시"; // 문자열은 자체가 문자배열
		names[1] = "서울시";
		names[2] = "대전시";
		
		String[] names2 = {"천안시", "서울시", "대전시"};
		for(int i = 0; i < names2.length; i++) {
			System.out.print(names2[i] + "\n");
		}
		
		// 참조형 변수: 배열, 문자열(String), 객체 배열(class 배열)
		// 멤버변수(클래스마다 기억공간 할당), 멤버함수 공용으로 사용(한번만 메모리를 차지함)
		// Car[] : 데이터 타입
		// cars : 변수 = 배열 공간에 대한 주소값
		Car[] cars = new Car[3]; // 메모리, 객체 == 참조형 변수
		cars[0] = new Car("소나타"); //멤버변수에 대하여 각각 기억공간을 할당
		cars[1] = new Car("아반테");
		cars[2] = new Car("아우디");
		for(int i = 0; i < cars.length; i++) {
			cars[i].drive();
		}
		
	}
}
