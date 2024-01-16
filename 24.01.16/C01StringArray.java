package Ch17;

public class C01StringArray {
	public static void main(String[] args) {

		String[] names = { "홍길동", "남길동", "서길동" };

		System.out.println("names의 길이 : " + names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		// String 클래스 배열
		String[] stringArray = new String[3];
		stringArray[0] = "Hello";
		stringArray[1] = "World";
		stringArray[2] = "!";
		// 배열 요소 출력
		for (String str : stringArray) {
			System.out.println(str);
		}

	}

}
