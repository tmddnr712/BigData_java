package june0628;

public class NationInformTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NationInform korea;
		korea = new NationInform();
		korea.setPopulation(50000000);
		korea.setNation("���ѹα�");
		korea.setCapital("����");
		String[] sp = {"�Ƹ���", "���ֹڹ���", "���ִ�"};
		korea.setSpeciallist(sp);
		
		int pop = korea.getPopulation();
		String nt = korea.getNation();
		System.out.println(nt + "�� Ư¡�� ������ �����ϴ�.");
		
		String[] sp_receive = korea.getSpeciallist();
		for(int i = 0; i < sp_receive.length; i++) {
			System.out.print(sp_receive[i] + " ");
		}
		System.out.println();
		

	}

}
