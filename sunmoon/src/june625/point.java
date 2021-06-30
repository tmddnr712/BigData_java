package june625;

public class point {
	double x;
	double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public point() {}
	public point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double theta() {
		double radian_result = Math.atan2(x, y); // ¶óµð¾È pi
		return Math.toDegrees(radian_result);
	}
	
	public double distanceTo(point po) {
		double dx = this.x - po.x;
		double dy = this.y - po.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}
