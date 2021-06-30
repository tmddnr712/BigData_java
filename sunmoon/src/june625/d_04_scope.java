package june625;
// 메모리를 효율적으로 사용해야함
// 처리 속도를 고속
public class d_04_scope {
	int z = 100;
	static int t = 200;
	public d_04_scope(int z) {
		this.z = z;
	}
	public static void main(String[] args) {
		int x = 100;
		// TODO Auto-generated method stub
		System.out.println(x);
		{
			int y = 100;
			System.out.println(y);
		}
		System.out.println(t);
	}
	d_04_scope d = new d_04_scope(100);
}

// 문제 : 
// 주소록 class : Member
// name, zipcode, address, add1, add2, ssn1, ssn2, age의 정보를 저장
// 대한이 123-456, '서울', '종로구', '11111', '1111118', 20