package com.evoke.Assignment1;

import java.util.Scanner;

public class CheckEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value= ");
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println(" 1 ");
		} else {
			System.out.println(" 0 ");
		}
	}
}