package Ch22;

//### Object 클래스 ###

//java.lang.Object 클래스는 자바에서 모든 클래스의 최상위 부모 클래스임. 
//모든 클래스는 기본적으로 Object 클래스를 암시적으로 상속받음.

//1. toString() 메서드	:	객체를 문자열로 표현하는데 사용.
//System.out.println(obj)와 같은 코드에서 객체를 출력할 때 자동으로 호출.


//2. equals(Object obj) 메서드	:	두 객체가 동등한지 여부를 비교하는데 사용.
//기본 구현은 객체의 참조(주소)를 비교하므로, 실제 동등성 비교를 위해 이 메서드를 재정의할 수 있습니다.
//Object 클래스에서 제공되는 equals 메서드는 == 연산자와 동일하게 동작하며, 객체의 레퍼런스(메모리 주소)를 비교
//but, 객체의내용을 비교하도록 재정의될 뿐임 ==> 예를 들면 String Class나 Integer Class에서!!


//3. hashCode() 메서드	:	객체의 해시 코드 값을 반환.
//HashMap, HashSet 등과 같은 해시 기반 컬렉션에서 객체를 저장하고 검색하는 데 사용.


//4. getClass() 메서드	:	객체의 클래스 정보를 반환.
//리플렉션(Reflection)과 같은 고급 프로그래밍 기술에서 주로 사용.


//5. clone() 메서드	:	객체를 복제하여 동일한 속성을 가진 다른 객체를 생성.
//Cloneable 인터페이스를 구현해야 하며, 적절한 예외 처리가 필요.


//6. finalize() 메서드	:	가비지 컬렉터가 객체를 수거하기 전에 호출.
//Java 9부터는 이 메서드가 이 메서드가 더 이상 권장되지 않음.
//가비지 컬렉션 대안으로 try-with-resources와 AutoCloseable 인터페이스를 사용하는 것이 권장.


//==>Object 클래스의 메서드들은 모든 자바 클래스에 공통적으로 적용되며, 필요에 따라 이러한 메서드들을 오버라이딩하여 클래스에 특화된 동작을 정의할 수 있음.

class A {
	int x = 10;
	int y = 20;
	
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
}
public class Object01 {
	public static void main(String[] args) {
		Object ob = new Object();
		System.out.println(ob.toString());
		System.out.println(ob);
		
		A ob1 = new A();
		System.out.println(ob1.toString());
		System.out.println(ob1);
	}

}
