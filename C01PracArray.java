package Ch16;

import java.util.Scanner;

public class C01PracArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		// 10크기의 int형 배열을 만들어서
		// 반복문과 함께 해당배열의 0 ~ 9 까지 요소에 각각 정수값을 입력(설정)
		
		int[] ar1 = new int[10];
		int max = ar1[0];
		int min = ar1[0];
		int sum = 0;
		double avg = 0;
		
		ar1[0] = sc.nextInt();
		ar1[1] = sc.nextInt();
		ar1[2] = sc.nextInt();
		ar1[3] = sc.nextInt();
		ar1[4] = sc.nextInt();
		ar1[5] = sc.nextInt();
		ar1[6] = sc.nextInt();
		ar1[7] = sc.nextInt();
		ar1[8] = sc.nextInt();
		ar1[9] = sc.nextInt();
		
		
		
		// for문
		for(int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]);
			if(ar1[i] > max) {			// ar1[0] 이 max 보다 크다면
				max = ar1[i];			// max에 ar1[0]을 대입
			}
			if(ar1[i] < min) {			// ar1[0] 이 min 보다 작다면
				min = ar1[i];			// min에 ar1[0]을 대입
				
			}
			sum += ar1[i];				// i가 0번째 일 때의 값 sum에 가산
//			avg = sum / ar1.length;				// 몫이 5이기 때문에 자동형변환으로 5.0이 나옴 -> 우리는 이것을 원하는 것이 아님 평균을 구하는 것이기 때문에
			avg = (double) sum / ar1.length;	// sum을 강제형변환 해주고 나누기 연산 --> 5.5가 나옴
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		// 코드 합쳐보기!
		

	}

}
