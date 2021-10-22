package com.evoke.Assignment2;

import java.util.Arrays;

public class CopyOfAnElements {

public static void CopyOfArray() {
//	 public void SourceArray() {

		int[] myarray = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int[] myarraycopy = new int[10];
		   System.out.println("myarray  : "+Arrays.toString(myarray));     

		myarraycopy= myarray;
		   System.out.println("myarraycopy  : "+Arrays.toString(myarraycopy));     

	/*	for (int i : myarray) {
		System.out.print(i);
				}
		System.out.println("");
		System.out.println("my array copy is :" );

		for (int j: myarraycopy) {
		System.out.print(j );

	}*/
	}
}

// import java.util.Arrays;

