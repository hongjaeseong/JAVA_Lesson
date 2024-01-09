package Ch13;

public class C04Constructor {								// Constructor : 생성자
	// 속성(멤버 변수) 선언
	String name;
	int age;
	
	// ### 생성자 메서드 (Constructor Method) ###
	// 객체가 생성될 때(생성자 메서드 역할) 호출되는 특별한 메서드
	// 클래스를 사용하여 객체를 생성 시 new 키워드를 사용하면 해당 클래스의 생성자가 1회 호출
	// 생성자는 주로 객체의 속성값 초기화를 수행하는 역할
	// 기본적으로 클래스 내에 생성자(Constructor)가 명시되어 있지 않다면 디폴트 생성자(Default Constructor == 기본 생성자)
	// 가 자동적으로 주입돼 사용
	
	
	// ### 생성자 사용법 ###
	// 1. 생성자 함수는 클래스 이름과 반드시 동일해야함.		
	// 2. 클래스와 동일하게 반환 타입(반환 자료형)이 없음.
	
	// 생성자(constructor)
	public C04Constructor() {
		System.out.println("default 생성자입니다!");			// 클래스이름과 똑같은 메서드가 생성자임	
	}
	
	// ### 인수(argument)와 매개변수(parameter) ###
	// 1. 인수란?					: 함수 호출 시 함수로 값을 전달해주는 변수
	//							: main --> 클래스 내 함수
	
	
	// 2. 매개변수란?				: 매개변수는 함수 호출 시에 전달된 인수(argument)값을 저장
	//							: 함수 호출 시 인수로 전달된 값을 함수 내부에서 사용할 수 있도록 하는 변수
	//							: 클래스 내 함수 --> 함수 {} 몸체 내 코드
	
	// 매개변수는 함수 내에서 지역변수로 사용됨.
	
	// 매개변수 생성자(constructor)
	public C04Constructor(String name, int age) {	// String name = "John", int age = 25
		System.out.println("매개 변수 생성장입니다!");
		this.name = name;			// 변수(속성)초기화
		this.age = age;				// 변수(속성)초기화
	}
	
	// ### this Keyword ###
	// 클래스 내에서 사용되는 예약어			==> 클래스 내에서 사용됨.
	// 생성되는 객체의 위치정보를 가져오는데 사용됨.			==> this, person1과 유사
	
	// 멤버변수 vs 매개변수 구별
	// this.name = name
	
	// ## this() ###
	// Overloading(오버로딩)된 다른 생성자 호출 가능함.	(나중에 함)
	
	// ### 온점('.') 접근 연산자 ###
	// 온점(.)은 자바에서 멤버 접근 연산자(Member Access Operator)로 사용
	// 즉, 클래스 내부에 정의되어 있는 각 변수(속성), 메서드(기능) 등에 접근할 대 사용.
	// 온점을 사용해 클래스 멤버 변수에 값을 할당(데이터 저장) 혹은 값을 읽음(데이터 읽기)가 가능.
	
	// 기능(메서드) 선언
	public void greet() {
		System.out.println("안녕하세요 , 제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
	}
	
	public static void main(String[] args) {
		
		// Person 클래스의 인스턴스 생성
		C04Constructor person1 = new C04Constructor("John", 25);		// 매개변수 생성자에 인수 두개 전달
		
		// 속성 값 할당 및 출력
		person1.name = "Jane";							// 온점을 이용해 클래스 멤버 변수에 값을 할당
		person1.age = 30;
		System.out.println("이름 : " + person1.name);		// 값을 읽음
		System.out.println("나이 : " + person1.age);
		
		// 기능 사용 및 출력
		person1. greet();

	}

}
