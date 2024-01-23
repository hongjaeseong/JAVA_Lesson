package Ch21;

//첫 번째 인터페이스
interface Flyable {
	void fly();
}

//두 번째 인터페이스
interface Swimmable {
	void swim();
}

//다중 상속을 받는 클래스
class Bird implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}

	@Override
	public void swim() {
		System.out.println("새가 수영합니다.");
	}
}

public class 다중상속01 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.swim();
		
		Flyable a = new Bird();
		a.fly();
//		a.swim(); 		// 불가능

	}

}
