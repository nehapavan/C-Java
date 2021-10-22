package com.evoke.Assignment2;

public class PatternPyramid {

	public static void main(String[] args) {
	//	int[][] arraysize = new int[4][4];
		System.out.println(" the elements are : ");

		int arr[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(" ");

			}
			for (int j = i; j <= 4; j++) {

				System.out.print(arr[i][j] + " ");

			}

			System.out.println(" ");

		}

	}

}

// a[0]=1;
// a[n]=n+1;
//		System.out.print("\t");
//	System.out.print(arr[i][j] );
