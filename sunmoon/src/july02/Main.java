package july02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Score score = new Score();
	int i=0;
		
	while(true){
		Student student = new Student();
		System.out.println("1.입력 2.수정(이름) 3.삭제(이름) 4.출력 5.프로그램 종료");
			
		int select = sc.nextInt();
		int exit = 0;
		switch (select) {
		case 1:
			score.Input(student);
			i++;
			break;
		case 2:
			score.Modify();
			break;
		case 3:
			score.Delete();
			break;
		case 4:
			score.Output();
			break;
		case 5:
			exit = 5;
			System.out.println("프로그램이 종료되었습니다.");
			break;

		default:
			break;
		}
		if(exit == 5) {break;}
        }	
   }
}
