package com.evoke.Assignment1;

import java.util.Scanner;

public class RevStringTypes {

	public static void main(String args[]) {

		RevStringTypes rev = new RevStringTypes();
		rev.FirstModel("");
		rev.SecondModel("");
	}

	public void FirstModel(String inputstring) {
		// TODO Auto-generated method stub

		// private static Scanner Sc;

		System.out.println("Enter any String = ");

		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		char[] letters = Sc.nextLine().toCharArray();
		System.out.println("The reverse string of input  is:");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i] + " ");

		}
		System.out.println("\n");

	}

	public void SecondModel(String string) {
		// TODO Auto-generated method stub
		String name = "niharika";
		System.out.println("name : " + name);

		int length = name.length();
		System.out.println("length of the name :  " + name.length());
		System.out.println("The reverse string is :");

		for (int i = length - 1; i <= name.length(); i--) {
			if (i >= 0 && i <= 8) {

				char rev = name.charAt(i);

				System.out.print(rev + " ");
			}

		}
	}

}
