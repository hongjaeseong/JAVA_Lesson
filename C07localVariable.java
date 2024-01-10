package Ch13;




class LocalVar {
	// 속성(멤버변수)
	int num = 10;			// 전역변수 num
	int num1;				// 전역변수
	// 기능(메서드)
	void Func1() {
		System.out.println("멤버변수 num = " + num);
		if(true) {
			int num = 100;				// if문 안에서만 사용되는 지역변수 num, if 벗어나면 소멸
			num1 = 50;
			System.out.println("num1 = " + num1);
			System.out.println("if문 안의 지역변수 num = " + num);
		}
		System.out.println("num1 = " + num1);
		System.out.println("멤버변수 num = " + num);
	}
	
	void Func2() {
		int i = 1;			// 지역변수
		int num = 6;		// 지역변수
		while (i <= 5) {
			System.out.println("num = " + (num++));			// 먼저 처리하고 대입 따라서 6부터 10까지
			i++;
		}
		System.out.println("while 벗어남 num = " + (num));
		System.out.println("멤버 변수 num = " + (this.num));			// this= obj
	}
	
}


public class C07localVariable {

	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
		obj.Func1();
		obj.Func2();

		
		
		
		
		
		
	}

}
