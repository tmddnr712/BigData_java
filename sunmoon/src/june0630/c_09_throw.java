package june0630;

public class c_09_throw {
	static void validate(int age) {
		if(age < 18)
			throw new ArithmeticException("정당하지 않습니다.");
		else
			System.out.println("투표 권한 없음");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch(Exception m) {System.out.println("18이하의 수치가 입력 되었습니다.");}

	}

}
