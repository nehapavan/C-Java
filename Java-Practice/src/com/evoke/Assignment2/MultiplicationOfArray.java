package com.evoke.Assignment2;

public class MultiplicationOfArray {

public  static void ArrayMutiplication(){
	
	//	int[][] arraysize = new int[4][4];
		System.out.println(" the elements are : ");

		int[][] array1 = { { 1, 2, 3, 4 }, { -2, 8, 5, 4 }, { 5, 8, 7, -9, 8 }, { -5, -4, 0, 1 }, {} };
		int array2[][] = { { 3, 4, 5, -8 }, { 4, 7, 8, 9 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, {} };

		System.out.println("length of array is : " + array1.length * array2.length);

		int n1 = array1.length;

		/*
		 * for(int i=0;i<=n;i++) {
		 * 
		 * 
		 * for(int j=0;j<=n;j++) {
		 * 
		 * 
		 * System.out.print(array1[i][j] +" " ); }
		 */
		for (int i = 0; i < n1; i++) {

			for (int j = 0; j < array1[i].length; j++) {

				System.out.print(array1[i][j] * array2[i][j] + " ");
				System.out.print(" ");

			}
			System.out.println(" ");

		}

	}
}

//System.out.println(" ");

//* array2[i][j]