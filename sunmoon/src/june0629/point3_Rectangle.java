package june0629;

class Box{
	point3 po1;
	point3 po2;
	double perimeter;
	double diagonal;
	double volume;
	public Box() {}
	public Box(point3 po1, point3 po2) {
		this.po1 = po1;
		this.po2 = po2;
	}
	public Box(int x1, int y1, int z1, int x2, int y2, int z2) {
		this.po1 = new point3(x1, y1, z1);
		this.po2 = new point3(x2, y2, z2);
	}
	void calc_perimeter() { // 둘레 구하기
		double upperbottom = 2 * (2 * Math.abs(po1.x - po2.x) + 2 * Math.abs(po1.y - po2.y));
		double height = 4 * Math.abs(po1.z - po2.z);
		perimeter = upperbottom + height;
	}
	
	double distancex() {
		return Math.abs(po1.x - po2.x);
	}
	double distancey() {
		return Math.abs(po1.y - po2.y);
	}
	double distancez() {
		return Math.abs(po1.z - po2.z);
	}
	
//	void calc_diagonal() { // 대각선 구하기
//		double dx = po1.x - po2.x;
//		double dy = po1.y - po2.y;
//		double dz = po1.z - po2.z;
//		diagonal = Math.sqrt(dx*dx + dy*dy + dz*dz);
//		diagonal = Math.sqrt(distancex() * distancex());
//	}
	void calc_diagonal() {
		double dx = distancex();
		double dy = distancey();
		double dz = distancez();
		diagonal = Math.sqrt(dx*dx + dy*dy + dz*dz);
	}
	void calc_volume() { // 체적
		double dx = Math.abs(po1.x - po2.x);
		double dy = Math.abs(po1.y - po2.y);
		double dz = Math.abs(po1.z - po2.z);
		volume = dx * dy * dz;
	}
	public point3 centerPoint() { // 중심점 구하기
		double centerx = po1.x + (po1.x - po2.x) / 2;
		double centery = po1.y + (po1.y - po2.y) / 2;
		double centerz = po1.z + (po1.z - po2.z) / 2;
		return new point3(centerx, centery, centerz);
	}
	public double distanceTo(Box box) {
		point3 center1 = centerPoint();
		point3 center2 = box.centerPoint();
		return center1.distanceTo(center2);
	}
	public void print() {
		System.out.println("두점(" + po1.x + "," + po1.y + "," + po1.z + "),(" + po2.x + "," + po2.y + "," + po2.z +
				             ")의 둘레:" + perimeter + "대각선의 길이: " + diagonal + "체적: " + volume);
	}
}



public class point3_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point3 po1 = new point3(1, 1, 1);
		point3 po2 = new point3(10, 10, 10);
		Box box1 = new Box(po1, po2);
		point3 po3 = new point3(4, 4, 4);
		point3 po4 = new point3(24, 24, 24);
		Box box2 = new Box(po3, po4);
		System.out.println("두 박스간의 거리는" + box1.distanceTo(box2));
	}

}
