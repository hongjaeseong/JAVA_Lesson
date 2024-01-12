package Ch14;

import Ch13.C03AccessModifier;


// 상속 후에 한번 더 복습해주세요 ==> protected Method 접근에 관한 수업입니다!
public class C03AccessModifier3 extends C03AccessModifier{
	
	
	public C03AccessModifier3(int a, int b, int c, int d) {
		super(a, b, c,d);
		
	}

	public static void main(String[] args) {
		// C03Accessmodifier3의 인스턴스 생성
		C03AccessModifier3 myObject = new C03AccessModifier3(1, 2, 3, 4);

		// public 메서드 호출
		myObject.publicMethod();

		// protected 메서드 호출 (같은 패키지 내에서 가능)
		myObject.protectedMethod();
		
		// default 메서드 호출 (같은 패키지 내에서 가능)
//		myObject.defaultMethod();
		
		// private 메서드 호출 (동일 클래스 내에서 가능)
//		myObject.privateMethod();
		System.out.println();
		
		// C03AccessModifier의 필드에 접근
		System.out.println("Public Field : " + myObject.publicField);
		System.out.println("Protected Field : " + myObject.protectedField);
//		System.out.println("Default Field : " + myObject.defaultField);
		
		// private 필드는 클래스 내에서만 접근 가능
//		System.out.println("Private Field : " + myObject.privateField);
//		myObject.setPrivateField(5);
//		System.out.println("Private Field : " + myObject.getPrivateField());

	}

}
