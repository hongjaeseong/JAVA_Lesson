package Ch20;

// 문제 01)
// 추상 클래스 Moonbanggu를 정의하는데 sharpenCnt, PencilCnt 속성 선언 및 초기화하고 write를 추상 메서드로 가짐.
// 이를 상속받는 Sharpen, Pencil 클래스를 정의하세요!

// Sharpen, Pencil 객체를 생성할 때마다 sharpenCnt, PencilCnt 속성값들이 1씩 감소해야 합니다.
//접근제어자와 statc,non-static 고려하기!

abstract class Moonbanggu {
	public static int SharpenCnt = 100;
	public static int PencilCnt = 100;
	abstract void write();
	
}

class Sharpen extends Moonbanggu {
	
	public Sharpen() {
		// 부모클래스를 상속받으니깐 부모클래스의 속성값을 이용할 수 있다.(힌트)
		if(SharpenCnt >= 1) {
			SharpenCnt--;
		}
	}
	
	@Override
	void write() {
		System.out.println("샤프로 씁니다.");
		
	}
	
}

class Pencil extends Moonbanggu {
	
	public Pencil() {
		if(PencilCnt >= 1) {
			PencilCnt--;
		}
	}
	
	@Override
	void write() {
		System.out.println("연필로 씁니다.");
	}
	
}


public class Prac {
	// Writing(), ShowInfo()
	public static void Writing(Moonbanggu item) {
		item.write();					
		
	}
	
	public static void ShowInfo() {
		System.out.printf("샤프재고량 : %d, 연필재고량 : %d ", Moonbanggu.SharpenCnt, Moonbanggu.PencilCnt );
		
	}
	
	public static void main(String[] args) {

		Sharpen item1 = new Sharpen();		// 문방구가 가지는 SharpenCnt 속성값이 1줄어야함.
		Pencil item2 = new Pencil();		// 문방구가 가지는 PencilCnt 속성값이 1줄어야힘.
//		Moonbanggu obj = new Sharpen();		
		// 펜 개수, 샤프 개수가 인스턴스에 종속되어 있구나! == 멤버들을 static 변수로 바꿔야겠구나
		System.out.println(Moonbanggu.PencilCnt);
		System.out.println(Moonbanggu.SharpenCnt);
		
		Writing(item1);						//"샤프로 씁니다" 가 출력
		Writing(item2); 					//"연필로 씁니다" 가 출력 
		ShowInfo();							// 샤프재고량 : 99, 연필재고량 :99
		
		
		
	}
}
