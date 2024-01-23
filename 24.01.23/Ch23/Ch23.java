package Ch23;

//### 제네릭(Generic) ###
//타입(Type)을 일반화하여 코드의 재사용성과 안정성을 향상시키는 기술
//코드를 특정한 데이터 타입에 의존하지 않고 일반적으로 작성할 수 있음.
class Box<T> {
	private T content;

	public Box(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
}



public class Ch23 {
	public static void main(String[] args) {
		// 문자열을 담은 Box 생성
		Box<String> stringBox = new Box<>("Hello, Generic!");
		String content = stringBox.getContent();
		System.out.println("String Box Content: " + content);

		// 정수를 담은 Box 생성
		Box<Integer> intBox = new Box<>(42);
		int intValue = intBox.getContent();
		System.out.println("Integer Box Content: " + intValue);

		// 불린 값을 담은 Box 생성
		Box<Boolean> booleanBox = new Box<>(true);
		boolean boolValue = booleanBox.getContent();
		System.out.println("Boolean Box Content: " + boolValue);
	}
}

//### 제네릭의 상속 ###
//1. "제네릭 타입의 상속"
//2. "와일드카드"

//1. 제네릭 타입의 상속:
//제네릭 타입 간에는 일반적인 상속 관계가 있음.
//예를 들어, Box<T>가 있을 때, Box<Integer>와 Box<Double>은 각각 Box<T>의 하위 타입임. 
//이것은 제네릭에서 서브타이핑(subtyping)을 나타냄.

//==> 서브타이핑 : 어떤 타입이 다른 타입의 하위 타입이 되는 것을 의미

//class Box<T> {
// // ...
//}
//
//Box<Integer> intBox = new Box<>();
//Box<Double> doubleBox = new Box<>();
//
////Box<Integer>는 Box<T>의 하위 타입임.
//Box<T> genericBox = intBox;

//2. 와일드카드:
//와일드카드는 제네릭에서 다양한 타입을 다룰 수 있는 중요한 기능 중 하나
//와일드카드는 ?로 표시되며, 제네릭 클래스나 메소드에서 다양한 타입을 처리할 때 사용됩니다.

//2-1. 상한 와일드카드 (<? extends T>):

//public void process(List<? extends Number> numbers) {
// // Number 클래스 또는 Number의 상속받는 하위 클래스들만 제네릭타입으로 가지겠다는 이야기.
// // Number 또는 Number의 서브타입으로 작업 가능
// for (Number number : numbers) {
//     // ...
// }
//}
//이 경우, List<? extends Number>는 Number 또는 Number의 서브타입으로 제한된 리스트

//2-2. 하한 와일드카드 (<? super T>):

//public void addNumbers(List<? super Integer> numbers) {
// // Integer 또는 Integer의 상위타입으로 추가 가능
// numbers.add(42);
//}

//이 경우, List<? super Integer>는 Integer 또는 Integer의 상위타입으로 제한된 리스트.

//# 요약 #
//제네릭에서 상속은 일반적인 상속 관계가 적용되며, 와일드카드는 다양한 타입을 처리하기 위한 유용한 도구 
//상한 와일드카드(<? extends T>)는 T 또는 T의 하위타입으로 제한된다. 
//하한 와일드카드(<? super T>)는 T 또는 T의 상위타입으로 제한된다
