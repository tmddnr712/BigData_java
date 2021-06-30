package june0629;

public class point3 {
	public double x;
	public double y;
	public double z;
	public point3(int x, int  y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public point3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
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
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	
	public double distance() { // 원점으로부터의 거리
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public double distanceTo(point3 po) {
		double dx = this.x - po.x;
		double dy = this.y - po.y;
		double dz = this.z - po.z;
		return Math.sqrt(dx*dx + dy*dy + dz*dz);
	}

}
