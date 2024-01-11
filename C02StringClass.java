package Ch14;


class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void bark() {
		System.out.println(name + "이/가 짖습니다");
	}
}

class Dog extends Animal {
	public Dog(String name , int age) {
		super(name, age);
	}
	
}

public class C02StringClass {

	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", 24);
		dog.bark();
	
		
		
		
		
		// 1
		String str1 = "java";			// 변수 선언 및 초기화		// java가 객체?? 클래스 생성안하고 객체를 생성한 것인가? ==> 맞다
		String str2 = "java";			// 변수 선언 및 초기화
		
		// 문자열 리터럴은 자체적으로 주소값을 가진다.
		
		//2
		String str3 = new String("java");		// 인스턴스화, 매개변수(객체의 속성을 가진) 생성자
		String str4 = new String("java");

		
		// 연산 : 객체의 (heap메모리)주소값을 비교
		System.out.println(str1 == str2);		// -> true
		System.out.println(str3 == str4);		// -> true
		System.out.println(str1 == str3);		// -> true
		System.out.println(str1 == str4);		// -> true
		
		
		
		
		// equals() : 객체의 내용만을 비교
		System.out.println(str1.equals(str2));		// -> true
		System.out.println(str3.equals(str4));		// -> true
		System.out.println(str1.equals(str3));		// -> true
		System.out.println(str1.equals(str4));		// -> true
		
		
		
		
		// 웹 개발, 앱 개발 할 때 주로 사용함.
		
		
		
		// ### HashCode() ###
		// 문자 자체를 해석 ==> 다른 형태로 보여주게끔 하는 것
		// 객체의 내용에 기반하여 해시 코드를 생성
		// 문자 자체를 해싱한 값
		System.out.println(str1.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str1.hashCode());
		
		// 같은 해시코드 값를 지니지만 서로 다른 객체가 될 수 있다. O
		
		
		// System.identityHashCode();
		// 객체의 실제 메모리 주소(객체의 물리적 위치)를 기반으로 하는 해시 코드를 반환.
		// Object 클래스의 메서드로, 모든 객체에서 사용할 수 있음.
		// 실질적인, 물리적인 메모리(객체의 물리적 위치)의 실제 객체 위치를 해싱한 값
		
		System.out.println(System.identityHashCode(str1));		// 1365202186
		System.out.println(System.identityHashCode(str2));		// 1365202186
		System.out.println(System.identityHashCode(str3));		// 1651191114
		System.out.println(System.identityHashCode(str4));		// 1586600255
		
		
		
		
		
		
		
	}

}
