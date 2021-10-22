package com.evoke.Assignment1;

import java.util.Scanner;

public class ResultAll {
	public static void main(String[] args) {

		ResultAll opp = new ResultAll();
		opp.Operations();

	}

	public void Operations() {

		System.out.println("Enter 1st values = ");

		Scanner sc = new Scanner(System.in);
		// int n =sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		System.out.println("The value of r=" + (a + b * c));
		System.out.println("The value of r=" + (a + b) % c);

		System.out.println("The value of r=" + a + b * c / d);

		System.out.println("The value of r= " + (a + b / c * d - e % f));

	}
}
