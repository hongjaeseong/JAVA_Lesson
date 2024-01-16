package Ch17;

class Person{
	
	String name;
	String age;					// 문자열 만능 ==> 실수, 정수 ==> 문자열로 받을 수 있음
	String address;
	int money;
}




public class C03StringArrayMain {
	public static void main(String[] args) {
		
		
		
		// 클래스 배열을 선언하는 것과 객체를 만드는 일은 별개다?
		// 정수형 배열을 선언하고 그 안에 값을 넣는 것처럼
//		int[] age = new int[3];								// 배열을 만드는 것일 뿐, 객체를 만드는 것이 아니다! --> 후에 객체를 만드는 과정을 꼭 동반해야
		
		// Person 클래스 배열 ==> 클래스 배열
		// 클래스 배열을 자료형을 가지는 student 참조변수를 하나 생성
		// 크기가 3인 클래스 배열을 선언한 부분과 연결하는 과정
		
		Person[] student = new Person[3];
		// 이 코드가 의미하는 바가
		// 1. 배열을 선언하는 것이다 = O
		// 2. 배열의 선언과 동시에 각각의 인덱스에 할당되는 클래스 객체가 만들어 지는 것이다. = X
//		student[0] = new Person();					--> 객체를 안만들고 실행하면 오류남
		student[0] = new Person();					// 배열의 객체 생성
		student[0].name = "홍길동";					// 객체의 속성값 초기화
		student[0].age = "35";
		student[0].address = "대구";
		student[0].money = 1000;
		
		student[1] = new Person();
		student[1].name = "남길동";
		student[1].age = "25";
		student[1].address = "부산";
		student[1].money = 2000;
		
		student[2] = new Person();
		student[2].name = "구길동";
		student[2].age = "45";
		student[2].address = "울산";
		student[2].money = 3000;
		
		for(int i = 0; i < student.length; i++) {
			System.out.println("이름 : " + student[i].name);
			System.out.println("나이 : " + student[i].age);
			System.out.println("주소 : " + student[i].address);
			System.out.println("소지금 : " + student[i].money);
			System.out.println();
		}
		
		
		
		
		
		
	}

}
