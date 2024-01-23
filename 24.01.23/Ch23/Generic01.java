package Ch23;

abstract class 주재료 {			// 추상 클래스
	String 재료;
	
	주재료(String 재료) {
		this.재료 = 재료;
	}

	@Override
	public String toString() {
		return "주재료 [재료=" + 재료 + "]";
	}
}

class 커피 extends 주재료 {
	public 커피 (String 재료) {
		super(재료);
	}
	
}
class 차 extends 주재료 {
	public 차 (String 재료) {
		super(재료);
	}
	
}
class 주스 extends 주재료 {
	public 주스 (String 재료) {
		super(재료);
	}
}

class 음료 <T extends 주재료> {		// 제네릭 타입 T는 주재료 클래스 또는 주재료 하위 클래스(상속받은)만을 받아올 수 있다는 의미.
	private T 재료;
	
	음료(T 재료) {				
		this.재료 = 재료;
	}
	
	void ShowInfo() {
		System.out.println(재료.toString() + "으로 만든 음료!");
	}
}
public class Generic01 {
	public static void main(String[] args) {
		음료<커피> 커피음료 = new 음료<>(new 커피("커피원두"));
		커피음료.ShowInfo();
		
		음료<차> 차음료 = new 음료<>(new 차("녹차 잎"));
		차음료.ShowInfo();
		
		음료<주스> 주스음료 = new 음료<>(new 주스("오렌지"));
		주스음료.ShowInfo();
		
		
		
		
		
		
		
	}

}
