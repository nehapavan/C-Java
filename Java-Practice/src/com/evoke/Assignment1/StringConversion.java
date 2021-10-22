package com.evoke.Assignment1;

import java.util.Scanner;

public class StringConversion {

	// private static Scanner Sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any String = ");

		// String line=Sc.nextLine();

		char[] letters = Sc.nextLine().toCharArray();

		System.out.println("reverse string is:");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}
		String line = Sc.nextLine();
		System.out.println("length of a string is: " + line.length());
		System.out.println("upper string is: " + line.toUpperCase());
		System.out.println("lower case string is: " + line.toLowerCase());

	}
}
