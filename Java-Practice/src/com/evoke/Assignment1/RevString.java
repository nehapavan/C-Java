package com.evoke.Assignment1;

import java.util.Scanner;

public class RevString {

	// private static Scanner Sc;

	public static void main(String[] args) {
		System.out.println("Enter any String = ");

		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		char[] letters = Sc.nextLine().toCharArray();
		System.out.println("reverse string is:");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);

		}
	}

}
//int i=sc.nextInt();