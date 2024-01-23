package Ch20;

class Super01 {
	void func1() {
		
	}
	
}

class Sub01 extends Super01 {
	void func1() {
		System.out.println("지금 내 마음대로 재정의하고 출력하는 코드입니다!");
		
	}
}






abstract class Super02 {
	abstract void func2();
}

class Sub02 extends Super02 {

	@Override				// 강제로 오버라이딩 된 메서드
	void func2() {
		System.out.println("지금 강제로 재정의하고 출력하는 코드입니다!!");
	}
}
public class C01AbstractTest {
	public static void main(String[] args) {
		Super01 obj1 = new Sub01();			// 업캐스팅
		obj1.func1();
		System.out.println();
		
		
		
//		Super02 obj2 = new Super02();		// Error
											// 추상 클래스의 인스턴스화 불가
		Super02 obj3 = new Sub02();			// 업캐스팅
		obj3.func2();						// 자식 클래스의 오버라이딩 된 메서드를 이용하기 위한 코드
	}

}
