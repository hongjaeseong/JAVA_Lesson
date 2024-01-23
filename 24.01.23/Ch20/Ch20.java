package Ch20;

// ### 추상 클래스와 추상 메서드 ###

// 추상 클래스 : 하나 이상의 추상 메서드를 포함하는 클래스
//			: 객체를 직접 생성할 수 없음.
//			: abstract 키워드를 사용


// 추상 메서드 : 추상 메서드는 선언만 있고 구현이 없는 메서드
//			: 하위 클래스에서 반드시 구현되어야 함.
//			: abstract 키워드를 사용


// ==> 추상 클래스는 객체를 직접 생성할 수 없기 때문에 하위 클래스를 통해 인스턴스를 생성하고 사용함.

// ### 추상 클래스가 왜 필요할까!? ###

// 추상 클래스는 클래스 간의 계층 구조에서 공통된 특성을 갖는 클래스를 정의
// 이를 상속받는 구체적인 클래스에서 세부적인 구현을 제공하기 위해 사용함.


abstract class Shape {
    // 추상 메서드 선언
    abstract void draw();

    // 일반 메서드
    void resize() {
        System.out.println("Resizing the shape");
    }
}

class Circle extends Shape {
    // 추상 메서드 구현
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    // 추상 메서드 구현
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}



public class Ch20 {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Square square = new Square();
		
		
		circle.draw();
		circle.resize();			// 추상 클래스가 가지고 있는 일반 메서드도 사용 O
		square.draw();
		
		
		
		// 굳이 Shape클래스에 draw() 메서드를 구현할 필요가 없어서 추상클래스, 추상메서드 사용함
		
		
		
	}

}
