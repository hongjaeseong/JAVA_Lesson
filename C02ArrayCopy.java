package Ch16;

import java.util.Arrays;

public class C02ArrayCopy {					// 배열의 복사
	public static void main(String[] args) {
		
		int [] arr1 = {10, 20, 30};			// 크기가 3이고 정수 자료형을 가지는 arr1 배열 객체
		
		
		System.out.println(arr1);
		System.out.println(arr1.hashCode());
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr1[0]));		// 배열이라도 서로 다른 메모리 주소값을 가짐
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));
		System.out.println();
		
		// 얕은 복사 (위치값 복사)	// 그림판 설명해줌
		int [] arr2 = arr1;		// 하나의 객체에다가 여러개의 참조변수를 연결할게 아니라면 실수하지 말자!
		// 객체의 주소값을 공유		// 얕은 복사 같은 경우는 위치값을 복사하는 것이다 보니깐, arr1의 각 요소값을 변경하면 arr2의 요소값도 변경!!
								// 그렇기 때문에 만약에 하나의 객체 {10, 20, 30}이 저장된 배열을 말하는 거고
								// 여기에 여러개의 참조변수를 연결하는 경우가 아니라면 얕은 복사를 사용하지 말자!
		
		
		int [] arr3 = new int[3];			// 크기가 3이고 정수 자료형을 가지는 arr3 배열 객체
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];					// 깊은 복사 (데이터 값 복사)	arr1[0]의 값을 arr3[0]에 대입 --> 데이터복사
		}
		
		
		// 깊은 복사
		int [] arr4 = Arrays.copyOf(arr1, arr1.length);		// 복사원본, 얼만큼 복사할지 (길이)
		
		
		System.out.println("arr1 : " + arr1);		// arr1과 arr2 얉은 복사 --> 동일 주소값을 가짐
		System.out.println("arr2 : " + arr2);
		System.out.println("arr3 : " + arr3);		// arr3과 arr4 깊은 복사 --> 다른 주소값을 가짐
		System.out.println("arr4 : " + arr4);
		System.out.println();
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		
		for(int n : arr1) {
			System.out.println(n);
		}
		
		
		
		for(int n : arr4) {				// 원본 훼손 x
			System.out.println();
			System.out.println(arr4[0]);
			System.out.println(arr4[1]);
			System.out.println(arr4[2]);
		}
		

	}

}
