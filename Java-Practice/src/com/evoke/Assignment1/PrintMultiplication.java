package com.evoke.Assignment1;

import java.util.Scanner;

public class PrintMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number=");
		int a = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(a + " x " + (i + 1) + "=" + a * (i + 1));
		}

		System.out.println(a + "Table");
	}

}
