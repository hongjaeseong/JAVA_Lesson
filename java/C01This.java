package Ch14;

//### 'this' Keyword ###
//클래스 내에서 사용되는 예약어
//생성되는 객체의 위치정보를 가져오는데 사용됨.

//멤버변수 vs 매개변수 구별
//this.name = name



//## this() ##
//Overloading(오버로딩)된 다른 생성자 호출 가능함.

class C02Simple {
	int x;
	int y;
	
	public C02Simple() {								// 생성자 : 속성값 초기화 역할
//		x = 10; 
//		y = 10;
		this(10,10);									// 매개변수 생성자 C02Simple(int x, int y) 생성자 호출
		System.out.println("디폴트 생성자 호출!");
	}
	C02Simple (int x ) {
		//this.x = x; 
		//y = 10;
		this(x, 10);
		System.out.println("int x 생성자 호출!");
	}
	C02Simple (int x, int y) {
		this.x = x;										// this.x = 10
		this.y = y;										// this.y = 10
		System.out.println("int x, int y 생성자 호출!");
	}
	
	
	C02Simple getThis() {
		return this;
	}
}


public class C01This {

	public static void main(String[] args) {
		C02Simple ob = new C02Simple(12);
		System.out.println(ob.toString());
		System.out.println(ob.getThis());
		
		System.out.println(ob.x);
		System.out.println(ob.y);

	}

}
