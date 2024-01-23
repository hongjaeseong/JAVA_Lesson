package Ch22;


//### Wrapper Class ###

//Wrapper 클래스는 자바에서 기본 데이터 타입(primitive types)을 객체로 감싸기 위한 클래스들을 말함. 
//기본 데이터 타입에 해당하는 int, char, boolean, double, 등을 객체로 다루기 위해 제공되는 클래스.
//이러한 Wrapper 클래스들은 해당 기본 데이터 타입의 값을 갖고 있고, 각종 유용한 메서드를 제공하여 객체로서의 동작을 가능하게 함.

//1. Integer		: int의 Wrapper 클래스
//2. Long			: long의 Wrapper 클래스
//3. Float			: float의 Wrapper 클래스
//4. Double		: double의 Wrapper 클래스
//5. Character		: char의 Wrapper 클래스
//6. Boolean		: boolean의 Wrapper 클래스
//7. Byte			: byte의 Wrapper 클래스
//8. Short			: short의 Wrapper 클래스

//Wrapper 클래스는 객체이므로 null도 가질 수 있고, 기본 데이터 타입의 값을 객체로 다룰 수 있음.
//또한, 자동 박싱(autoboxing)과 자동 언박싱(autounboxing)이라는 개념이 O
//==> 기본 데이터 타입과 Wrapper 클래스 간에 자동으로 변환될 수 있음.

////자동 박싱 (Autoboxing)
//Integer intObject = 42; // int를 Integer로 자동으로 변환
//
////자동 언박싱 (Autounboxing)
//int intValue = intObject; // Integer를 int로 자동으로 변환

public class Wrapper01 {
	public static void main(String[] args) {
		// Boxing (자료 ==> Integer정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		// Integer 클래스의 특정 생성자인 Integer(int)가 자바 9버전 이후로 사용되지 않게 되었고 
		// 향후 버전에서는 완전히 삭제될 예정이라는 경고 메세지
		
		Integer obj2 = new Integer("200");
		// Integer(String) 생성자의 내부 로직은 Integer.parseInt(String)이 담겨있음.
		
		Integer obj3 = Integer.valueOf("300");			// valueOf 메서드 ==> 새로운 방식의 Integer 객체 생성
		Integer obj4 = Integer.valueOf(100);
		
		System.out.println(obj3);
		System.out.println(obj4);
		
		 int intValue = 52;
		 Integer obj5 = Integer.valueOf(intValue);
		 System.out.println(obj5);
		 
		 
		 // UnBoxing (Integer자료형 ==> 일반 자료형)
		 System.out.println();
		 
		 int value1 = obj1.intValue();
		 int value2 = obj2.intValue();
		 
		 System.out.println(value1);
		 System.out.println(value2);
		 
		 System.out.println(value1 + value2); 		// 100과 200의 연산값이 나옴
		 											// ==> 정수형태의 데이터 타입으로 UnBoxing이 잘되었다.
		 
		 
		 
		 // 자동 Boxing
		 Integer obj = 200;			// autoBoxing
		 int n1 = obj + 300;		// autoUnBoxing
		 
		 System.out.println(n1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
