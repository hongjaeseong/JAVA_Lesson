package Ch13;



// ### 메서드 오버로딩(중복해서 불러오겠다) ### //






class C09Simple {
	String name;
	int sum(int x, int y) {
		System.out.println("sum(int, int) 호출!");
		this.name = "이동하";
		return x + y;
	}
	int sum(double x, double y) {
		System.out.println("sum(double, double) 호출!");
		return (int) (x + y);					// 형 변환?
	}
	int sum(int x, int y, int z) {
		System.out.println("sum(int, int, int) 호출!");
		return x + y;
	}
	int sum(String str1, int x, int y) {
		System.out.println("sum(String, int, int) 호출!");
		name = str1;
		return x + y;
	}
}
	


public class C08MethodOverloading {

	public static void main(String[] args) {
		C09Simple obj = new C09Simple();
		C09Simple obj1 = new C09Simple();
		obj.sum(10, 20);				// this.sum(10, 20); 는 왜 안되는가?-> 객체 2개 생성시 무엇을 가리킬지 알 수 없어 오류남
		obj.sum(10.2, 10.2);
		obj.sum(10, 20, 30);
		obj.sum("Hello World", 10, 20);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
