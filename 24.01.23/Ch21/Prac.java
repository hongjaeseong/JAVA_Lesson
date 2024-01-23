package Ch21;

// Shape 인터페이스를 하냐 구현하고 이를 상속 받는 Circle 클래스를 완성하라!
// Shape 인터페이스가 가지는 속성과 메서드는

//	PI = 3.14
// draw()
// getArea()
// deafault 메서드 redraw()


// Circle 클래스가 가지는 속성과 메서드는
// int r		// 반지름
// 메서드는 여러분들이 구성해보세요!
public class Prac {
	public static void main(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
									  // 원의 넓이가 314.0인 원을 그립니다.
		donut.redraw();				  // 다시 그립니다. 원의 넓이가 314.0인 원을 그립니다.
		System.out.println("면적은 " + donut.getArea()); // 면적은 314.0
		
	}

}













interface Shape {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); //도형의 면
	default public void redraw() { // 디폴트 메소드
	      System.out.print("--- 다시 그립니다.");
	      draw();
	}
}

class Circle implements Shape{
	int r;
	Circle (int num) {
		r = num;
		draw();
	}
	@Override
	public void draw() {
		double result = getArea();
		System.out.println("원의 넓이가 " + result + " 인 원을 그립니다.");
		
	}
	@Override
	public double getArea() {
		return r*r*PI;
	}
}




