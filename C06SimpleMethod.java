package Ch13;

import java.util.Scanner;

// ### 'Return' Keyword ###

// 자바에서 메소드가 값을 반환하는데 사용되는 키워드
// 반환되는 값의 자료형은 메소드의 선언에서 지정한 반환 자료형과 일치해야 함.

// 메소드의 실행을 중지하는 데에도 사용됨.
// 메소드 내에서 어는 위치에서든 return을 만나면 해당 위치에서 메소드의 실행이 종료됨.

class Sum {
	// 속성
	Scanner sc = new Scanner (System.in);
	
	// 기능(4가지 경우)
	// 반환값 O 매개변수 O
	int sum1(int x, int y) {		 // x와 y는 매개변수
		return x + y;
	}
	
	// 반환값 O 매개변수 X
	int sum2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
		
	}
	
	// 반환값 X 매개변수 O
	void sum3(int x, int y) {				// x와 y는 매개변수
		System.out.println("Sum3(x, y) = " + (x + y) );
	}
	
	// 반환값 X 매개변수 X
	void sum4() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Sum4(x, y) = " + (x + y) );
	}
	
	// return으로 메소드 실행 중지 예제
	void sum5(int x, int y) {
		if(x < 0 || y < 0) {
			System.out.println("음수는 처리할 수 없습니다!");
			return;
		}
		System.out.println("이 코드는 실행되지 않습니다!"); // 만약 x,y가 음수라면 이 라인의 코드는 실행하지 않고 메소드 종료
	}
	
	
	
}




public class C06SimpleMethod {
	public static void main(String[] args) {
		
		
		Sum calc = new Sum();				// Sum 객체 생성 이후 calc 참조변수 연결
		
		int r1 = calc.sum1(10,20);
		System.out.println("sum1(x, y) = " + r1);
		
		int r2 = calc.sum2();
		System.out.println("sum2() = " + r2);
		
		calc.sum3(12, 34);
		calc.sum4();
		
		calc.sum5(1, 1);
		
		
		
		
		
		
		
		

	}

}
