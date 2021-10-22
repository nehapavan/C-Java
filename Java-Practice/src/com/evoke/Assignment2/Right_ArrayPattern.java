package com.evoke.Assignment2;

public class Right_ArrayPattern {

	public static void RightanglePattern() {
	//	int[][] arraysize = new int[5][5];
		System.out.println(" the elements are : ");

		int arr[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j <=i; j++) {

				// System.out.print(arr[i][j] );

				System.out.print(arr[i][j] + " ");
				// System.out.print("\t");

			}
			System.out.println(" ");

		}
	}
}
// a[0]=1;
// a[n]=n+1;
//System.out.print("\t");
//System.out.print(arr[i][j] );
//  for(int j=3;j>=i;j--) {     prints rev
