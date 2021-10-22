package com.evoke.Assignment1;

import java.util.Scanner;

public class HoursToMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter seconds= ");
		int seconds = sc.nextInt();

		int hr = seconds / 60;
		int min = seconds % 60;
		hr = hr / 60;
		int se = hr % 60;

		System.out.println(hr + " :" + min + ":" + se);

	}
}