package Ch15;

class Controller {
	
	private MemberInfo member;			// 참조변수 member -> MemberInfo에 대한 member변수의 정보를 가짐.
	
	
	//getter 만들기
	public MemberInfo getMember() {
		return member;
	}
	//setter 만들기
	public void setMember(MemberInfo member) {					// MemberInfo member = obj;	
		// member 참조변수 == 특정 객체에 대한 위치 정보를 가지는 변수
		this.member= member;						// this -> con객체 // member속성값에 = obj연결
	}
}

class MemberInfo{
	// 3가지 속성
	String name;
	int age;
	String addr;
	// 매개변수 생성자 == 객체에 대한 속성 초기화를 담당
	public MemberInfo(String name, int age, String addr) {
		super();												// 클래스를 상속받는 경우 작성해줘야 함. 현재 모든 클래스는 Object클래스의 상속을 받는다. 이 경우에는 생략 가능. 
		this.name = name;										// 하지만 다른 임의의 클래스를 상속받는 경우에는 작성해줘야 한다.
		this.age = age;
		this.addr = addr;
	}
	
//	art + shift + s
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}



public class C01ClassMethod {

	public static void main(String[] args) {
			MemberInfo obj = new MemberInfo("홍재성", 28, "대구");		// 1. 그림판 설명해줌
//			System.out.println(obj.toString());
			
			
			
			Controller con = new Controller();						// 2. 그림판 설명해줌
			con.setMember(obj);
			
			
			MemberInfo tmp = con.getMember();						// 3. 그림판 설명해줌
			
			System.out.println();
			
			System.out.println(System.identityHashCode(tmp));		// 같은 객체를 참조하고 있다!
			System.out.println(System.identityHashCode(obj));
			
			System.out.println(tmp.toString());

	}

}
