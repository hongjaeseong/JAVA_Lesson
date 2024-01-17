package Ch18;

class ABC {
	int n1;		// 비정적멤버
	static int n2;
	
	void Func1() {
		n1 = 10;
		n2 = 20;
	}
	
	static void Func2() {
//		n1 = 10;			// error 발생
							// 이유는 객체!!!(n1 : 비정적멤버이기 때문)를 만들고 접근가능한 변수가 n1인데,
							// static은 객체가 없어도 부를 수 있어야 함.
							// 만약에 Func2()에서 n1 = 10; 코드가 유효하다면
							// 어떤 객체에 대한 n1의 값을 바꾸는지 우리는 알 수 없음
		
		n2 = 20;			// 모든 객체의 n2의 정보가 ==> 20으로 바뀜.
		
		int num = 10;		// 사용가능, 이유는 지역변수이니깐(소멸됨)
	}
}



public class C02Static {
	public static void main(String[] args) {
		ABC instance = new ABC();
		
		instance.Func1();
		System.out.println(instance.n1);
		System.out.println(instance.n2);
		ABC.Func2();
	}
}
