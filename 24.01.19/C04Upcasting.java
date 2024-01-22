package Ch19;

//### 업캐스팅과 다운캐스팅 ###

//1. 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것을 의미.
//class Animal { }
//class Dog extends Animal { }
//
//Dog myDog = new Dog();
//Animal myAnimal = new Dog(); // 업캐스팅

//2. 다운캐스팅 :  상위 클래스 타입으로 캐스팅된 객체를 다시 원래의 하위 클래스 타입으로 변환하는 것을 의미 == 업캐스팅이 전제되어야 함.
//명시적인 형 변환 연산자가 필요하며, == 강제 형변환이 필요하다
//이를 통해 객체를 다시 원래 타입으로 사용할 수 있음.


//### 다운캐스팅은 주의점 ###
//실제로 해당 객체가 원하는 하위 타입의 인스턴스인지를 확인하는 작업이 필요함.

//class Animal { }
//class Dog extends Animal { }


//Animal myAnimal = new Dog();
//Dog myDog = (Dog) myAnimal; // 다운캐스팅


////다운캐스팅 전에 instanceof 연산자를 사용하여 객체의 타입을 확인하는 것이 안전 ==> boolean 타입으로 결과값을 반환
//if (myAnimal instanceof Dog) {
//Dog anotherDog = (Dog) myAnimal;				// myAnimal이 Dog 클래스의 인스턴스라면 다운캐스팅을 진행해라.
//}


//### 객체와 인스턴스의 차이점 ###
//Dog mydog = new Dog();						// mydog는 Dog 클래스의 인스턴스이자, 실제 객체이기도 함.
											// mydog는 Animal 클래스의 인스턴스이지만, 실제 객체는 아닙니다.
//==> Dog클래스는 Animal클래스로 부터 상속을 받았기 때문에 (파생되었기 때문에) Animal의 인스턴스가 될 수 있지만 객체는 꼭 아니다.


class Super {
	int a;
}

class Sub extends Super {
	int b;				// 확장 멤버 변수
}

public class C04Upcasting {
	public static void main(String[] args) {
		Super ob1 = new Super();		// NoCasting
		Sub ob2 = new Sub();			// NoCasting
		
		Super ob3 = new Sub();			// UpCasting(업캐스팅 가정 하에 부모자료형 타입을 가지는 ob3가 Sub의 인스턴스가 됨.)
										// 인스턴스는 파생의 개념이라고 생각하면 편함
										// 참조변수 ob3는 new Sub()를 통해 Sub클래스의 객체(heap memory)가 맞고 Super 클래스의 객체는 아니다(클래스 자료형이 Super(스택 메모리에 참조변수 저장)인 것 뿐)
										// ob3는 Sub클래스의 인스턴스가 물론 맞고 Sub클래스는 Super 클래스를 상속받기 때문에 Super클래스의 인스턴스 또한 맞다
										// 객체는 구체적 실제적인 의미임, 인스턴스는 좀 더 추상적이고 파생의 개념임
		
		ob3.a = 1;
//		ob3.b = 2;						// Error
										// 참조변수 ob3의 범위가 부모  클래스 타입까지이므로 
										// 자식의 확장 멤버 변수에 접근이 불가함.
		if (ob3 instanceof Sub) {
			Sub down = (Sub) ob3;		// DownCasting
			down.b = 2;					// 참조하고 있는 Sub 객체를 부모 타입으로 ob3가 참조하고 있음 = 업캐스팅
										// 업캐스팅된 객체 ob3를 다시 Sub 클래스 타입을 자료형으로 가지는 down 참조변수에
										// 다운캐스팅을 통해서 객체 연결
										// 그로 인해 down 참조변수는 b 속성에 접근이 가능함.
		}
		
		
		
	}
	

}
