package june0629;
// 클래스는 부모 1개, 상속 3개, 실행 클래스 1개
// 부모 클래스인 Shape
// 면적을 계산하고 저장하며 출력할 수 있음
// Circle, Rectangle, Triangle
// 반지름 = pi * r ^2, 둘레 = 2 * pi * r
// width, heigt
// 삼각형 : 밑변 * 높이 / 2
// 부모의 배열에 원, 사각형, 삼각형을 입력하고 면적을 출력해 보세요.
class Shape{
	public double area;
	public void calArea() {
		
	}
	public void display() {
		System.out.println("면적은: " + area + "입니다.");
	}
}

class Circle extends Shape{
	public double radius;
	public Circle(double radius) {
		this.radius = radius;
		calArea();
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calArea() {
		area = Math.PI * radius * radius;
	}
	
}

class Rectangle extends Shape{
	public double width;
	public double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		calArea();
	}
	public void calArea() {
		area = width * height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
		calArea();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}

class Triangle extends Shape{
	public double width;
	public double height;
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		calArea();
	}
	public void calArea() {
		area = 0.5 * width * height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}

public class b_04_Shape {
	public static void Shapeprint(Shape sh) {
		if(sh instanceof Circle) {
			Circle cl = (Circle) sh; // 다운그레이드
			cl.calArea();
			cl.display();
			cl.getRadius();
		}
		else if(sh instanceof Rectangle) {
			Rectangle re = (Rectangle) sh; // 다운그레이드
			re.calArea();
			re.display();
		}
		else if(sh instanceof Triangle) {
			Triangle tr = (Triangle) sh; // 다운그레이드
			tr.calArea();
			tr.display();
		}
	}

	public static void main(String[] args) {
		Circle cl = new Circle(10);
		cl.display();
		Shape sh = new Circle(20);
		sh.display(); // 자식의 면적이 출력
		Circle cc1 = (Circle) sh;
		System.out.println("원의 반지름은" + cc1.getRadius());
		Rectangle re = new Rectangle(10, 20);
		re.display();
		Triangle tr = new Triangle(10, 5);
		tr.display();
		
		Shape[] all = new Shape[3];
		all[0] = cl;
		all[1] = re;
		all[2] = tr;
		for(int i = 0; i < all.length; i++) {
			all[i].display();
		}
		Shapeprint(sh);
		Shapeprint(sh);
		Shapeprint(sh);
		Shapeprint(sh);
		Shape sh2 = new Rectangle(30, 90);
		Shapeprint(sh2);
	}

}
