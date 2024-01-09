package Ch13;

public class C03AccessModifier {
	// public 접근 제어자
	public int publicField;
	// protected 접근 제어자
	protected int protectedField;
	// default (package - private) 접근 제어자
	int defaultField;
	// private 접근 제어자
	private int privateField;
	
	// 생성자
	public C03AccessModifier(int publicField, int protectedField, int dafaultField, int privateField) {
		this.publicField = publicField;
		this.protectedField = protectedField;
		this.defaultField = defaultField;
		this.privateField = privateField;
	}
	
	
	
	// 메서드
	public void publicMethod() {
		System.out.println("1. Public Method");
	}
	public void protectedMethod() {
		System.out.println("2. protected Method");
	}
	void defaultMethod() {
		System.out.println("3. default Method");
	}
	private void privateMethod() {
		System.out.println("4. private Method");
	}
	
	// ### Getter와 Setter ### 가지고 오는 얘, 설정하는 얘
	// 객체 지향 프로그래밍에서 클래스의 속성(멤버 변수)에 접근하거나 값을 설정하기 위한 메서드
	
	// Getter()메서드( == 접근자 메서드 ) 저장
	// Getter는 클래스의 private 속성 값을 읽어오는 메서드
	// 일반적으로 속성 이름 앞에 "get"을 붙여서 메서드 이름을 지정함. get 뒤에 대문자로 변환
	// Getter 메서드는 주로 해당 속성의 값을 반환
	public int getPrivateField() {
		return privateField;
	}
	
	// Setter() 메서드( == 설정자 메서드) 지정
	// Setter 는 클래스의 private 속성 값을 설정하는 메서드
	// 일반적으로 속성 이름 앞에 "set"을 붙여서 메서드 이름을 지정함.
	// Setter 메서드는 주로 해당 속성에 값을 설정
	public void setPrivateField(int privateField) {
		this.privateField = privateField;
		
	}
	
	public static void main(String[] args) {
		// C03Accessmodigier의 인스턴스 생성
		C03AccessModifier myObject = new C03AccessModifier(1, 2, 3, 4);
		
		// public 메서드 호출
		myObject.publicMethod();
		
		// protected 메서드 호출 (같은 패키지 내에서 가능)
		myObject.protectedMethod();
		
		// default 메서드 호출 (같은 패키지 내에서 가능)
		myObject.defaultMethod();
		
		// private 메서드 호출 (동일 패키지 내에서 가능)
		myObject.privateMethod();
		System.out.println();
		
		// C03Accessmodifier의 필드에 접근
		System.out.println("Public Field : " + myObject.publicField);
		System.out.println("Protected Field : " + myObject.protectedField);
		System.out.println("Default Field : " + myObject.defaultField);
		
		// private 필드는 클래스 내에서만 접근 가능
		System.out.println("Private Field : " + myObject.privateField);			// 동일한 클래스 내이기 때문 잘 실행됨.
		myObject.setPrivateField(5);
		System.out.println("Private Field : " + myObject.getPrivateField());
				
	}
}
