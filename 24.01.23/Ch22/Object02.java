package Ch22;

class Subject {
	int s;
	public Subject(int s) {
		this.s = s;
	}
	@Override
	public boolean equals(Object obj) {		// 업캐스팅
											// 타입이 Object이기 때문에 어떤 객체도 받을 수 있음.
		if(obj instanceof Subject) {
			Subject down = (Subject) obj;
			return this.s == down.s;
		}
		return false;
		
	}
}

class ABC extends Subject {
	int x;
	public ABC(int n, int x) {
		super(n);
		this.x = x;
	}
}
public class Object02 {
	public static void main(String[] args) {
		Subject ob = new Subject(100);			// 멤버속성 s가 100으로 초기화된 객체를 ob와 연결
		Subject ob1 = new Subject(100);
		Subject ob2 = new Subject(200);
		
		System.out.println(ob);
		System.out.println(ob1);
		
		System.out.println(ob.equals(ob1)); // ob  : equals 메서드를 부른 주체
											// ob1 : equals 메서드에 의해 비교당하는 객체
		System.out.println(ob.equals(ob2));
		String ob3 = "안녕";
		System.out.println(ob.equals(ob3)); // Subject의 인스턴스가 아니면 false
		
		ABC ob4 = new ABC(100, 20);			// 속성 s : 100, 속성 x : 20
		System.out.println(ob.equals(ob4));
		
		
		
		
		
		
		
		
		
		
	}

}
