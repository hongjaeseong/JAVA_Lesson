package Ch13;


//문제 2: 학생 클래스 만들기

//1. Student 클래스를 작성하세요.
//2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
//3. 객체의 속성 name과 age에 각각 직접 값을 초기화하세요.
//4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.

public class PracStudent {
	
	String name;
	int age;
	
	public void displayInfo() {
		System.out.println("[SYSTEM] : 학생의 정보를 출력합니다!");
		System.out.println(name + "학생의 이름은 : " + name + "입니다!");
		System.out.println(name + "학생의 나이는 : " + age + "살 입니다!");
	}
	
	public static void main(String[] args) {
		PracStudent myStudent = new PracStudent();
		myStudent.name = "홍길동";
		myStudent.age = 22;
		
		myStudent.displayInfo();

	}

}
