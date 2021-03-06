package july01;
class Apple extends Object{ // equals. toString, clone
	public String toString() {
		return "나는 사과";
	}
}
class Banana{
	public String toString() {
		return "나는 바나나";
	}
}
class Orange{
	public String toString() {
		return "나는 오렌지";
	}
}
//일반화된 클래스를 작성하세요.
class FruitBox<T>{
	private T item;
	public void push(T item) {
		this.item = item;
	}
	public T pull() {
		return item;
	}
	
}

class AppleBox{
	private Apple item;
	public Apple push;
	public void push(Apple item) {
		this.item = item;
	}
	public Apple pull() {
		return item;
	}
}

class BananaBox{
	private Banana item;
	public Banana push;
	public void push(Banana item) {
		this.item = item;
	}
	public Banana pull() {
		return item;
	}
}

class OrangeBox{
	private Orange item;
	public Orange push;
	public void push(Orange item) {
		this.item = item;
	}
	public Orange pull() {
		return item;
	}
}

public class a_03_fruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleBox box1 = new AppleBox();
		box1.push = new Apple();
		BananaBox box2 = new BananaBox();
		box2.push = new Banana();
		OrangeBox box3 = new OrangeBox();
		box3.push = new Orange();
		
		FruitBox<Apple> box4 = new FruitBox<Apple>();
		box4.push(new Apple());
		FruitBox<Banana> box5 = new FruitBox<Banana>();
		box5.push(new Banana());
		FruitBox<Orange> box6 = new FruitBox<Orange>();
		box6.push(new Orange());
		
		System.out.println(box4.pull());
		System.out.println(box5.pull());
		System.out.println(box6.pull());
	}

}
