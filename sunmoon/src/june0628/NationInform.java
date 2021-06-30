package june0628;

public class NationInform { // 1: 다의 표현
	String nation;
	String capital;
	int population;
	String[] speciallist; // 배열 이름은 참조형 ( 주소값ㅁ
	
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
		if(population < 1) { // 데이터 보호
			System.out.println("인구는 1이상으로 설정하세요.");
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
