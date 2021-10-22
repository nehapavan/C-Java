package com.evoke.Assignment1;

import java.util.Scanner;

public class PrintNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Divided by 3 are : ");

		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0)
				System.out.print("\t" + i + " , ");

		}

		System.out.println("\n\nDivided by 5 are : ");
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0)
				System.out.println(i + " , ");
		}
		System.out.println("Divided by3 and 5 are : ");
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " , ");
		}
	}
}
