package Ch14;

import java.util.Scanner;

public class C03StringClass {

	public static void main(String[] args) {
//		int alength, blength;
//		char achar, bchar;
//		String str1 = new String("java Powerful");
//		String str2 = new String("java Programming");
//		String str3 = str1 + str2;
//
//		System.out.println(str3);
//
//		alength = str1.length();
//		blength = str2.length();
//		achar = str1.charAt(5);
//		bchar = str2.charAt(10);
//
//		System.out.println("Str1에 저장 = " + str1 + " 길이 = " + alength);
//		System.out.println("Str1에 저장 = " + str2 + " 길이 = " + blength);
//		System.out.println("Str1의 5번째 문자 = " + achar);
//		System.out.println("Str1의 10번째 문자 = " + bchar);
//		System.out.println("Str1의 대문자로 변환 : " + str1.toUpperCase());
//		System.out.println("Str1의 소문자로 변환 : " + str1.toLowerCase());
//		System.out.println("Str2의 a를 A로 변환 : " + str2.replace('a', 'A'));
//		System.out.println("----------------------------------------------");

		// trim()			// 웹 개발할 때 많이 사용함.
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();

//		System.out.println(tmp);
//		System.out.println(tmp.trim());

		// subString() : 문자열 자르기
//		System.out.println(tmp.substring(2)); // 초기값
//		System.out.println(tmp.substring(0, 2));

//		// indexOf('문자열') : 문자열의 index번호(0,1,2,3,4,5,...) 확인
//		System.out.println(tmp.indexOf("H")); // H가 없으면 -1 return

//		// lastIndexOf("문자열") : 문자열의 index번호 확인
//		System.out.println(tmp.lastIndexOf("H")); // 뒤에서부터 앞으로 검색
//
//		// contains("문자열") : 문자열 포함여부
//		System.out.println(tmp.contains("HE"));

		// -----------------------------------------
		// 문자열 + 문자열 연산
		// -----------------------------------------
//		System.out.println("문자열1" + "문자열2"); // 문자열 + 문자열
//		System.out.println("문자열1" + ',' + "문자열2"); // 문자열 + 문자 + 문자열
//		System.out.println("문자열1" + 2); // 문자열 + 숫자 ->숫자를 문자열로 해석! 단순연결

		// -----------------------------------------
		// 문자열 -> 숫자형변환
		// -----------------------------------------
		// 문자열 -> 숫자형으로 변환(정수)

//		int n1 = "10";

//		System.out.println("10" + "20"); // 문자열 연결
//		System.out.println( 10 + 20 );

//		int n1 = Integer.parseInt("10"); // 웹개발코드시 폼으로부터 전달받은 값은 다 문자열임
//		int n2 = Integer.parseInt("20");
//		System.out.println(n1 + n2);
//
//		// 문자열 -> 숫자형으로 변환(실수)
//		double n3 = Double.parseDouble("10.5");
//		double n4 = Double.parseDouble("20.4");
//		System.out.println(n3 + n4);
//
//		short n5 = Short.parseShort("5");
//		short n6 = Short.parseShort("6");
//		System.out.println(n5 + n6);
		
		
		
		//-----------------------------------------
		//숫자형 -> 문자형으로 변환
		//-----------------------------------------
		
		int value1 = 10;
		double value2 = 3.14;
		
		System.out.println(value1 + value2);	//연산(실수 + 정수 = 실수)
		
		String str1 = String.valueOf(value1);	//value1의 값을 스트링(문자형)을 변환해 str1으로 대입한다.
		String str2 = String.valueOf(value2);

		System.out.println(str1 + str2);		//문자열 붙이기
		

	}

}
