package Ch18;
// ### 자바의 메모리 구조 ###

// 1. 스택영역 : {} 내의 지역변수, 참조변수, 메서드 호출 및 리턴 값, 연산 중 발생하는 임시 데이터 등이 저장
// {} 내에서 생성, 벗어나면 소멸
// 메서드 호출 시마다 (스택)프레임(Frame)(상자 형태)이라는 작은 메모리 블록이 생성되어
// 메서드의 지역 변수와 연산 중 발생한 중간 결과 등을 저장함.
// 메서드가 종료되면 해당 프레임이 스택에서 제거됨.


// 후입선출(LIFO, Last In, First Out) 구조
// Ex) 프링글스 과자를 생각하면 편함.

// 2. 힙영역 : 객체 저장 공간
// new 예약어 사용시 생성
// 동적으로 생성된 객체와 배열이 저장되는 영역
// 모든 스레드가 공유하는 메모리 영역, 객체의 생성 및 소멸은 여기에서 이루어짐
// 소멸은 JVM의 가비지 컬렉터(Garbage Collector)에 의해서 소멸(더 이상 참조되지 않는 객체들을 정리)

// 3. 클래스영역(== 메서드 영역) : 공유메모리, static변수, 일반메서드, 생성자 메서드, 클래스 정보, 상수
// 클래스 정보( 클래스의 구조, 필드(속성), 메서드 코드 등)가 저장되는 영역
// 프로그램시작과 동시에 생성, 프로그램 종료 시 소멸

// 요약
// 1. 스택영역 : 지역변수, 메서드 호출 정보
// 2. 힙영역 : 객체 저장 공간, 배열 저장 공간
// 3. 클래스영역( == 메서드 영역, 정적 영역, Static영역) : 공유 메모리, static변수, 클래스 정보


// 외부 클래스 ==> 구글링
class Simple{
	// 내부 클래스 ==> 구글링
	public class MyClass {
		//정적 멤버(or static 멤버) --> 멤버는 속성과 기능 둘다 가르키는 말	
		public static int a = 10;
		public static void a_method() {
			System.out.println("This is a static method");
		}
		
		// 비정적 멤버
		public int b = 20;
		public void b_method() {
			System.out.println("This is a instance method");
		}
	}
	
	// 1. a, a_method()는 정적 멤버(Static Member)
	// 2. b, b_method()는 비정적 멤버(None - Member)
	
	// 정적 멤버는 클래스 자체(클래스 영역)에 속하며, 객체의 생성 없이 클래스 이름을 통해 직접 접근할 수 있음.(공유변슈)
	// 반면 비 정적 멤버는 객체는 인스턴스에 속하며, 해당 클래스의 객체를 생성한 후에만 접근할 수 있음.
	
	// 따라서 "비 정적"이라는 용어는 "정적"이 아닌, 즉 인스턴스에 속하는 것을 나타냄.
	
	// static 변수 ==> 클래스 영역에 저장
	static int Num1 = 0;			// 공유!!!!변수(정적멤버, static 멤버) -> Simple 클래스 영역에 있음
	int Num2 = 0;				// 비정적 멤버,스택영역
	
	
	void ShowNum() {				// 속성값 출력 기능// 비정적 멤버,스택영역
		System.out.printf("NUM1 : %d NUM2 : %d\n", Num1, Num2);
	}

}


public class C01Static {

	public static void main(String[] args) {
		// static이 붙는 변수(정적 멤버)는 클래스 자체에 속함.
		// ==> ### 클래스명.변수이름으로 변수를 호출할 수 있음. ### --< 중요!!
		// ==> Static변수는 클래스가 공유하고 있는 변수
		
		// 비 정적 멤버는 객체(인스턴스)에 속함.
		// ==> 객체마다 그 값이 다를 수 있음.
		
//		Simple.Num1 = 12;   중요!!!!!!!!
		
		
		
		
		
		Simple obj1 = new Simple();
		Simple obj2 = new Simple();
		
		// 스태틱 변수는 살작 누워잇음
		obj1.Num1 = 10;				// Num1은 공유하고 있기 때문   obj2.Num2 = 10 이다.!!  obj1과 obj2는 같은 클래스이다.
		obj1.Num2 = 20;
		obj1.ShowNum();
		
		
		obj2.ShowNum();				// Num1 = ?? Num2 = ??\
		System.out.println();
		
		
		Simple.Num1 = 123;
		System.out.println(Simple.Num1);
		obj1.ShowNum();
		obj2.ShowNum();
		System.out.println();
		
		
		
		// 부록, 위에 내용들이 이해되면 요 내용도 같이 소화!
		// MyClass의 정적 변수와 메소드를 직접 호출 O
		
		System.out.println("MyClass.a의 값 : "+ Simple.MyClass.a);		// 정적 변수 호출		// static 변수는 클래스 영역에 저장 -> 클래스 영역은 프로그램 시작 - 종료까지 실행되기에 메모리가 무거워짐 -> 주구장창 만들면 안됨
		Simple.MyClass.a_method();										// 정적 메소드 호출
		System.out.println();
		
		
		// MyClass 인스턴스(객체)를 생성하기 위해서 외부 클래스(Simple)의 객체를 먼저 만드는 과정.
		Simple simpleInstance = new Simple();
		
		// MyClass 인스턴스 생성 == 객체 생성
		Simple.MyClass myClassInstance = simpleInstance.new MyClass();
		
		// MyClass의 비정적 변수와메소드는 인스턴스(객체) 생성 후 호출 O
		System.out.println("MyClass.b의 값 : " + myClassInstance.b);		// 정적 변수 호출
		myClassInstance.b_method();										// 정적 메소드 호출
		
		
		// 구글링 (keyword : 자바 내부 클래스, java inner class, 자바 외부 클래스, java outer class)

	}

}
