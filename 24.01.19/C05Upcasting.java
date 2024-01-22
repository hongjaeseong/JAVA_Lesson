package Ch19;

class A {
	int a = 1;
}
class B extends A {
	int b = 2;
}
class C extends B {
	int c = 3;
}

public class C05Upcasting {
	// func1 method == 객체를 받아 업캐스팅 후 각각의 인스턴스 여부를 확인하고 그에 맞게 다운캐스팅 후 멤버속성에 접근
	public static void func1(A tmpvariable) {		// 업캐스팅
		if (tmpvariable instanceof B ) {
			B down = (B) tmpvariable;
			System.out.println(down.b);
		}
		if (tmpvariable instanceof C ) {
			C down = (C) tmpvariable;
			System.out.println(down.c);
		}
	}
	public static void main(String[] args) {
		B obj = new B();
		C obj1 = new C();
		
		// B클래스의 객체(A클래스 상속)이기 때문에 b 속성을 출력
		func1(obj);		// B객체를 func1에 전달
		
		// C클래스의 객체(B클래스 상속)이기 때문에 b 속성과 c 속성을 둘 다 출력 
		func1(obj1);	// C객체를 func1에 전달
		
		if (obj1 instanceof A) {
			System.out.println("Hello world");
		}
		
		
		
		
		
		
	}

}
