package Ch21;

//### Interface ###


//인터페이스 : 추상 메서드의 집합을 정의하는데 사용됨. 
//인터페이스는 클래스가 특정 메서드를 반드시 구현하도록 강제하며, 다중 상속을 지원. 
//인터페이스는 interface 키워드를 사용하여 정의되며, 메서드는 선언만 하고 몸체는 가지지 않습니다.

//### 인터페이스와 추상클래스의 차이점 ###
//인터페이스와 추상 클래스 사이의 중요한 차이 중 하나는 일반 메서드의 유무

//Interface(인터페이스) :
//Java 8 이전 추상 메서드만 가질 수 O 
//Java 8 이후 추상메서드, 디폴트 메서드와 정적 메서드를 가질 수 O
//상수 필드(자동으로 public, static, final이 적용됨)를 가질 수 있습니다.

//Abstract Class(추상 클래스) :
//추상 클래스는 일반 메서드와 추상 메서드 모두를 가질 수 O
//필드, 생성자, 일반 메서드, 추상 메서드 등을 가질 수 O

interface MyInterface {
	void MyMethod();		// 추상 메서드
}

class MyClass implements MyInterface {

	@Override
	public void MyMethod() {
		
	}
	
	
}



public class Ch21 {
	public static void main(String[] args) {
		
	}
	
	
	
	

}
