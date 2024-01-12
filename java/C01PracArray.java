package Ch16;

import java.util.Scanner;

public class C01PracArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
			if(ar1[i] > max) {
				max = ar1[i];
			}
			if(ar1[i] < min) {
				min = ar1[i];
				
			}
			sum += ar1[i];
			avg = sum / ar1.length;
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		

	}

}
