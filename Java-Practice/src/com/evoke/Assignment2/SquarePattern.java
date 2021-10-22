package com.evoke.Assignment2;

public class SquarePattern {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 5, 8 } };

		System.out.println(" Length of the array is : " + arr.length);

		System.out.println(" the elements are : ");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}

}
}
