package june0630;

public class c_04_interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}

	}

}
