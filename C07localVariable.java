package Ch13;


//### 지역변수(Local Variable) ###
//
//특정구역({}) 내에서 생성되어 그 구역에서만 사용 가능한 변수, 즉 함수 속에서 선언되어 함수 속에서만 사용 가능한 변수
//함수나 {}이 끝나게 되면 메모리에서 '소멸'


//### 전역변수 (Global Variable) ###
//어느 위치에서든 호출하면 사용이 가능한 변수 즉, 함수 밖에서 선언하여 클래스 전체에서 사용이 가능한 변수
//
//1. 전역변수는 프로그램 전체에서 사용 가능한 변수이다. 
//프로그램이 종료될 때까지 메모리에서 유지된다. 
//
//2.전역변수는 프로그램 내에서 어디에서든지 사용할 수 있으므로, 
//프로그램의 다른 부분에서 변수명이 중복되어 사용될 가능성이 있다.
//따라서 전역변수는 가능한 사용을 최소화해야 한다.

class LocalVar {
	// 속성 (멤버변수)
	int num = 10;
	
	void Func1() {
		System.out.println("멤버변수 num = " + num);
		
		if(true ) {
			int num = 100;					// if문 안에서만 사용되는 지역변수 num, if 벗어나면 소멸
			System.out.println("if문 안의 지역변수 num = " + num);
		}
		System.out.println("멤버변수 num  = " + num);
	}
	
	
	
	
	void Func2() {
		int i = 1;
		int num = 6;
		while( i <= 5) {
			 System.out.println("num = " + (num++));
			 i++;
		}
		System.out.println("while 벗어남 num = " + (num));
		System.out.println("멤버 변수 num = " + (this.num));			// this : new LocalVar의 객체 주소값
	}
}
public class C07localVariable {
	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
		
		obj.Func1();
		obj.Func2();
		
	}

}
