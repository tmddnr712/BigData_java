package july02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Score score = new Score();
	int i=0;
		
	while(true){
		Student student = new Student();
		System.out.println("1.�Է� 2.����(�̸�) 3.����(�̸�) 4.��� 5.���α׷� ����");
			
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
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			break;

		default:
			break;
		}
		if(exit == 5) {break;}
        }	
   }
}