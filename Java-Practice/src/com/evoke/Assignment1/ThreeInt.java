package com.evoke.Assignment1;

import java.util.Scanner;

public class ThreeInt {

	private static boolean abc;

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("enter no.of values : ");
		int n = Sc.nextInt();

		if (n < 2) {
			int a = Sc.nextInt();
			int b = Sc.nextInt();

			System.out.println("the result is : " + (a > b));
		} else if (n > 2) {
			int c = Sc.nextInt();
			int b = Sc.nextInt();

			System.out.println("the result is : " + (c > b));

		}
	}

}

//	System.out.println("Enter 1st value= " );

//	System.out.println("Enter 2nd value= " );

//	System.out.println("Enter 3rd value= " );
