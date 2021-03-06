package june0630;
// try catch finally
// 예외도 상속구조: Exception
// 크롤링 =======>
public class c_08_exception {
// 데이터 베이스 접속 ==> 강제로 close()
	public static void main(String[] args) {
		try {
			int a[] = new int[5]; // 예외발생시
			a[5] = 30;
			a[4] = 30;
		}
		
		catch(ArithmeticException e) {System.out.println(e);}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 없습니다.");
		}
		catch(Exception e) {System.out.println(e);} // 예외에 있어 최상위 부모
		finally {System.out.println("마지막은 항상 실행");}

	}

}
