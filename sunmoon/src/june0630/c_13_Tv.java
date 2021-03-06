package june0630;
//문제: 삼성, LG, 롯데에서 TV를 만들려고 합니다.
//기능은 on/off 기능만 있습니다.
//"삼성 tv가 켜졌습니다." "send("0000");
//기능 표준문제로 협회에서 on/off기능을 표준화하여 처리하고자 합니다.(인터페이스)
//테스트를 하기 위해서 tv가 입력되면 on함수로 켜고 off함수 끄는 처리를 하나의 함수로 구현하고 싶음
// 이 프로젝트를 구현해 보세요.
interface TvAction{
	void on();
	void off();
}
class SamsungTv implements TvAction{
	public void on() {
		System.out.println("삼성tv가 켜졌습니다.");
	}
	public void off() {
		System.out.println("삼성tv가 꺼졌습니다.");
	}
}
class LgTv implements TvAction{
	public void on() {
		System.out.println("엘지tv가 켜졌습니다.");
	}
	public void off() {
		System.out.println("엘지tv가 꺼졌습니다.");
	}	
}
class LotteTv implements TvAction{
	public void on() {
		System.out.println("롯데tv가 켜졌습니다.");
	}
	public void off() {
		System.out.println("롯데tv가 꺼졌습니다.");
	}
}
class TvTest{
	void autoOn(TvAction tv) {
		tv.on();
	}
	void autoOff(TvAction tv) {
		tv.off();
	}
	void testTv(TvAction tv) {
		autoOn(tv);
		autoOff(tv);
	}
}

public class c_13_Tv {
	
	public static void main(String[] args) {
		TvTest test = new TvTest();
		test.testTv(new SamsungTv());
		test.testTv(new LgTv());
		test.testTv(new LotteTv());
	}

}
