package com.evoke.Assignment2;

public class InsertAnArray {

	public static void InsertionOfAnElement() {
		// TODO Auto-generated method stub

		int[] myarray = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		System.out.println("length of array is : " + myarray.length);
		int[] insertedarray = new int[9];
		// insertedarray = myarray;
		System.arraycopy(myarray, 0, insertedarray, 0, myarray.length);
		System.out.println("my Array : ");

		for (int i : myarray) {
			System.out.print(i);
		}
		System.out.print("\nlength of inserted array is : " + insertedarray.length);

		System.out.println("\ninserted array   :");

		insertedarray[3] = 4;
		for (int j : insertedarray) {
			System.out.print(j);
		}

	}
}
