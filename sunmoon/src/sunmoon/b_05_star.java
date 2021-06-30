package sunmoon;

public class b_05_star {

	public static void main(String[] args) {
		int row = 10;
		/*for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//삼각형
		/*for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				if(j<=i) {
					System.out.print("* ");	
				}
			}
			System.out.println();
		}*/
		
		//삼각형
		/*for (int i = 0; i < row; i++) {
			for (int j = row; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		// 평행사변형
		/*for(int i = 0; i < row; i++) {
			for(int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= row; j++){
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		// 트리
		/*for(int i = 0; i < row; i++) {
			for(int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
	}

}
