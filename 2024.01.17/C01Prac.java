package Ch19;

import java.awt.Color;

// [1번] 다음 main()메서드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

// 출력 결과
// 32인치 1024컬러

// 부모 클래스
class TV {
	// 속성
	private int size;			// TV 사이즈
	
	
	
	// 매개변수 생성자	--> 객체 속성값 초기화
	public TV(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}


// 자식 클래스
class ColorTV extends TV {
	// 속성
	int color;					// TV 컬러
	
	// 매개변수 생성자 (부모클래스 매개변수 생성자 호출)
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	// 기능
		void printProperty() {
			System.out.println(getSize() + "인치" + " " + color + "컬러");		// 부모 클래스의 getter와 setter 가능
		}
}


public class C01Prac {
	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32, 1024);
		
		myTV.printProperty();
		
		myTV.setSize(120);
		myTV.printProperty();
		myTV.getSize();				// 이 코드는 무슨 의미?
	}

}
