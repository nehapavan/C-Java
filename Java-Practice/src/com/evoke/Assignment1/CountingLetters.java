package com.evoke.Assignment1;

import java.util.Scanner;

public class CountingLetters {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter any String for test=");
		String test = Sc.next();
		count(test);

	}

	public static void count(String x) {

		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;

		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i]))
				letter++;

			else if (Character.isSpaceChar(ch[i]))
				space++;

			else if (Character.isDigit(ch[i]))
				num++;

		}
		System.out.println("the string is=" + x);
		System.out.println("letter is=" + letter);
		System.out.println("space is=" + space);
		System.out.println("num is=" + num);

	}

}
