package Ch19;

class Super {
	int a;
}

class Sub extends Super {
	int b;			// 확장 멤버변수
}


public class C04Upcasting {
	public static void main(String[] args) {
		Super ob1 = new Super(); 		// NoCasting
		Sub ob2 = new Sub();			// NoCasting
		
		Super ob3 = new Sub();			// UpCasting(업캐스팅 가정 하에 부모자료형 타입을 가지는 ob3가 Sub의 인스턴스가 됨.) // 질문 해볼것!
										// 인스턴스는 파생의 개념이라고 생각하면 편함
										// 참조변수 ob3는 new Sub()를 통해 Sub클래스의 객체(heap memory)가 맞고 Super 클래스의 객체는 아니다(클래스 자료형이 Super(스택 메모리에 참조변수 저장)인 것 뿐)
										// ob3는 Sub클래스의 인스턴스가 물론 맞고 Sub클래스는 Super 클래스를 상속받기 때문에 Super클래스의 인스턴스 또한 맞다
										// 객체는 구체적 실제적인 의미임, 인스턴스는 좀 더 추상적이고 파생의 개념임
		ob3.a = 1;						
//		ob3.b = 2;						// Error
										// 참조변수 ob3의 범위가 부모 클래스 타입까지이므로 
										// 자식의 확장 멤버에 접근이 불가함.
		
		if (ob3 instanceof Sub) {		// ob3는 new Sub()객체를 참조(UpCasting을 의미)하고 있기 때문에 True 반환됨
			Sub down = (Sub) ob3;		// DownCasting
			down.b = 2;					// 참조하고 있는 Sub 객체를 부모 타입을 ob3가 참조하고 있음 = 업캐스팅
										// 업캐스팅된 객체 ob3를 다시 Sub 클래스 타입을 자료형으로 가지는 down 참조변수에
										// 다운캐스팅을 통해서 객체 연결
										// 그로 인해 down 참조변수는 b 속성에 접근이 가능함.
		}
		
		
	}

}
