package june0628;

public class NationInform { // 1: ���� ǥ��
	String nation;
	String capital;
	int population;
	String[] speciallist; // �迭 �̸��� ������ ( �ּҰ���
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		if(population < 1) { // ������ ��ȣ
			System.out.println("�α��� 1�̻����� �����ϼ���.");
			return;
		}
		this.population = population;
	}
	
	public String[] getSpeciallist() {
		return speciallist;
	}
	public void setSpeciallist(String[] speciallist) {
		this.speciallist = speciallist;
	}
}
