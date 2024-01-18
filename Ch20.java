package Ch20;

// ### 추상 클래스와 추상 메서드 ###

// 추상 클래스 : 하나 이상의 추상 메서드를 포함하는 클래스
//			: 객체를 직접 생성할 수 없음.
//			: abstract 키워드를 사용


// 추상 메서드 : 추상 메서드는 선언만 있고 구현이 없는 메서드
//			: 하위 클래스에서 반드시 구현되어야 함.
//			: abstract 키워드를 사용

// ==> 추상 클래스는 객체를 직접 생성할 수 없기 때문에 하위 클래스르 통해 인스턴스를 생성하고 사용함.

// ### 추상 클래스가 왜 필요한가? ###

// 추상 클래스는 클래스 간의 계층 구조에서 공통된 특성을 갖는 클래스를 정의
// 이를 상속받는 구체적인 클래스에서 세부적인 구현을 제공하기 위해 사용함.

// 간단 예시
abstract class Animal {
	abstract void makeSound();
}
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("야옹");
	}
}

class ciwawa extends Dog {
	
}
// 굳이 Animal에 makeSound() 메서드를 구현할 필요가 없어서 추상클래스, 추상 메서드 사용


public class Ch20 {
	public static void main(String[] args) {
		
	}

}
