package Ch23;
//문제

//1. Pair라는 제네릭 클래스를 작성하고 이 클래스는 두 개의 요소를 가짐.
//2. Pair 클래스의 생성자는 두 요소를 받아서 객체를 초기화함.
//3. getFirst 메소드는 첫 번째 요소를 반환함.
//4. getSecond 메소드는 두 번째 요소를 반환함.

class Pair<T, U> {
	private T first;
	private U second;

	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	//getter
	public T getFirst() {
		return first;
	}
	//getter
	public U getSecond() {
		return second;
	}

}

public class Prac {
	public static void main(String[] args) {

		// 두 개의 정수를 갖는 Pair 객체 생성
		Pair<Integer, Integer> intPair = new Pair<>(10, 20);
		
		System.out.println("First Element: " + intPair.getFirst());
		System.out.println("Second Element: " + intPair.getSecond());

		// 두 개의 문자열을 갖는 Pair 객체 생성
		Pair<String, String> stringPair = new Pair<>("Hello", "World");
		System.out.println("First Element: " + stringPair.getFirst());
		System.out.println("Second Element: " + stringPair.getSecond());

	}

}
