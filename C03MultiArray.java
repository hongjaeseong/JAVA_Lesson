package Ch16;

import java.util.Iterator;

public class C03MultiArray {
	public static void main(String[] args) {
		
		// 이차원배열 [행] [열]
		
		int [][] arr1 = new int[2][3];
		
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		
		arr1[1][0] = 11;
		arr1[1][1] = 22;
		arr1[1][2] = 33;
		
		
		System.out.println("행 개수 : " + arr1.length);
		System.out.println("0번 행의 열의 개수 : " + arr1[0].length);
		System.out.println("1번 행의 열의 개수 : " + arr1[1].length);
		System.out.println();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int[] a : arr1) {
			for (int b : a){
				System.out.println(b + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
