package june0628;

public class NationInformTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NationInform korea;
		korea = new NationInform();
		korea.setPopulation(50000000);
		korea.setNation("대한민국");
		korea.setCapital("서울");
		String[] sp = {"아리랑", "경주박물관", "충주댐"};
		korea.setSpeciallist(sp);
		
		int pop = korea.getPopulation();
		String nt = korea.getNation();
		System.out.println(nt + "의 특징은 다음과 같습니다.");
		
		String[] sp_receive = korea.getSpeciallist();
		for(int i = 0; i < sp_receive.length; i++) {
			System.out.print(sp_receive[i] + " ");
		}
		System.out.println();
		

	}

}
