package Ch19;

class Animal01 {
	void makeSound() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class Dog01 extends Animal01 {
	// 오버라이딩
	void makeSound() {
		System.out.println("개가 짖는다.");
	}
	
	// 추가 메서드
	void bark() {
		System.out.println("멍멍!! 왈왈!!");
	}
}



public class C03Overriding {
	public static void main(String[] args) {
		
		Animal01 animal = new Dog01();	// 다형성에 의한 객체 생성 // Animal01자료형을 가지는 new Dog01객체를 참조하고 있는 객체 생성
		animal.makeSound();				// 오버라이딩된 Dog 클래스의 makeSound 메서드 호출
		// animal은 부모 클래스 타입의 자료형을 가지고 있지만 자식 객체를 참조하고 있음.
		// 만약에 오버라이딩된 메서드가 자식 객체에 있다면
		// 부모클래스 타입을 자료형으로 가지는 참조변수는 오버라이딩된 메서드를 사용함.
		// 오버라이딩된 메서드가 없다면 부모클래스의 메서드만 사용 가능함.
		
		// ==> 요약하자면 부모 타입이지만 자식 객체의 오버라이드 된 메소드가 있단 그 메소드를 사용
//		animal.bark();
		
		Dog01 dog = new Dog01();
		dog.makeSound();
		dog.bark();
		
		
		
		
		
		
		
		
		

	}

}
