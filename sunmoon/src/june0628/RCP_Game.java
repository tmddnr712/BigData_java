package june0628;
import java.util.Scanner;
// 가위 바위 보 class
// 0   1  2
// comp, user, judge class 분할

class RCP_Game_Test {
	public RCP_Game_Test() {}
	private int answer;
	public RCP_Game_Test(int answer) {
		this.answer = answer;
	}
	
	public int getgetComputer() {
		answer = ((int) (Math.random()*100)) %3;
		return answer;
	}

}

class User{ // 입력 -> 정수, 문자열
	public User() {}
	String temp = "";
	int input = 0;
	Scanner person;
	User(int input){
		this.input = input;
	}
	public int getUser() {
		person = new Scanner(System.in);
		System.out.println("가위 바위 보 중에 선택하세요.");
		temp = person.nextLine(); // 문자열로 입력
		if(temp == null || temp.contentEquals("-1")){ // 종료를 위해서 필요
			return -1;
		}
		System.out.println("입력한 값: " +temp );
		input = Integer.parseInt(temp);
		return input;
	}
}

class Judge{ // 승패, 전적을 저장
	int totalcount;
	int wincount;
	int losecount;
	int drawcount;
	Judge(){
		totalcount = 0;
		wincount = 0;
		losecount = 0;
		drawcount = 0;
		System.out.println("게임이 초기화되었습니다.");
	}
	// 가위(0), 바위(1), 보(2)
	public int doarray(int com, int person) {// 승패 확인, 컴: 바위, 사람: 보
		int[][] judge = {{0,1,2},{2,0,1},{1,2,0}};
		return judge[com][person];
	}
	public void gamedicision(int com, int person) { // 결과에 따른 행동
		int result = doarray(com, person);
		totalcount++;
		if(result == 0) {
			System.out.println("비김");
			drawcount++;
		}
		else if(result == 1) { //유저를 기준으로 판단
			System.out.println("이김");
			wincount++;
		}
		else {
			System.out.println("짐");
			losecount++;
		}
		print();
	}
	public void print() {
		System.out.println("게임결과: " + totalcount + "전 " + wincount + "승 "
				            + drawcount + "비김 " + losecount + "패,\n");
	}
}
public class RCP_Game{
	
	public static void main(String[] args) {
		RCP_Game_Test comp = new RCP_Game_Test();
		User user = new User();
		Judge judge = new Judge();
		while(true) {
			int sel = user.getUser();
			if(sel == -1) {
				System.out.println("게임이 종료되었습니다.");
				judge.print();
				break;
			}
			judge.gamedicision(comp.getgetComputer(), sel);
		}
	}
	
}