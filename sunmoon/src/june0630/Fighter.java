package june0630;
// public void move(int x, int y);
public class Fighter extends Unit implements Fightable{
	private double x;
	private double y;
	public void move(int x, int y) {/* 내용 생략 */}
	public void attack(Unit u) {/* 내용 생략 */}
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}

}
