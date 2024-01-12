package Ch14;

public class C02StringClass {
	public static void main(String[] args) {
		// 1
		String str1 = "java";						// 서로 주소값이 같음(constant string poool 영역에 저장->문자열 자료 저장)
		String str2 = "java";						// 서로 주소값이 같음
													// 둘 다 같은 객체를 가리키고 있음
		// 2
		String str3 = new String("java");			// 서로 주소값이 다름(heap memory 영역에 각각 저장)
		String str4 = new String("java");			// 서로 주소값이 다름(heap memory 영역에 각각 저장)
		
		// == 연산 : 객체의 주소값을 비교
		System.out.println(str1 == str2);			
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println();
		
		
		// equals() : 객체의 내용을 비교
		System.out.println(str1.equals(str2));		// str1이 가르키고 있는 객체의 내용:java = str2이 가르키고 있는 객체의 내용:java
		System.out.println(str3.equals(str4));		// str3이 가르키고 있는 객체의 내용:java = str4이 가르키고 있는 객체의 내용:java
		System.out.println(str1.equals(str3));		// str1이 가르키고 있는 객체의 내용:java = str3이 가르키고 있는 객체의 내용:java
		System.out.println(str1.equals(str4));		// str1이 가르키고 있는 객체의 내용:java = str4이 가르키고 있는 객체의 내용:java
		System.out.println();
		
		
	
		
		
		// ### HashCode() ###
		// 객체의 내용(== java)에 기반하여 해시 코드를 생성
		// Object 클래스에서 상속받은 메서드로, 모든 객체에서 사용할 수 있음
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		
		// ### System.identityHashCode() ###
		// 객체의 실제 메모리 주소(객체의 물리적 위치)를 기반으로 하는 해시 코드를 반환. (Ex. 120번지, 121번지, 122번지)(constant string pool, heap memory)
		// Object 클래스의 메서드로, 모든 객체에서 사용할 수 있음.
		// 따라서 동일한 객체라도 두 번 생성되면 다른 메모리 주소를 가지므로, 서로 다른 identityHashCode 값을 반환.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		// 서로 동일한 해시코드 값을 가지지만 서로 다른 객체가 될 수 있다? O or X ==> O
		
		
		
	}

}
