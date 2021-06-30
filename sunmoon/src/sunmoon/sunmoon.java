package sunmoon;

public class sunmoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch;
		ch = new char[4]; //배열 생성
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//배열 내용 출력
		for(int i = 0; i < ch.length; i++)
			System.out.println("ch["+i+"]:"+ch[i]);
		
	}

}
