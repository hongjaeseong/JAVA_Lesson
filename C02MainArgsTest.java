package Ch17;

public class C02MainArgsTest {
	public static void main(String[] args) {						// (String[] args) : 문자열 배열이였다!!	// args(arguments): 인수, 인자
		System.out.println("배열 길이 : " + args.length);
		
		for(String str : args) {
			System.out.println(str);
		}
		

		
		
// File -> properties -> location -> 파일시스템 주소 복사 -> cmd실행 -> cd 띄우고 붙여넣기 입력 -> java C02MainArgsTest.java arg1 arg2 arg3 입력 -> 배열길이, forEach문 출력
		
		
	}

}
