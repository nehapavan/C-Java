package com.evoke.Assignment1;

import java.util.Scanner;
public class AllOperations {
public static void main(String args[]) {
	int a;
	int b;
	
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter 1st value=" );
	a=Sc.nextInt();
	System.out.println("Enter 2nd value=" );
	b=Sc.nextInt();
	
	 int sum =a+b;
	 int substract =a-b;
	 int mul =a*b;
	 double div =a/b;
	 int rem =a%b;
	 System.out.println("addition =" +sum);
	 System.out.println("substract=" +substract);
	 System.out.println("multiplication =" + mul);
	 System.out.println("division =" +div);
	 System.out.println("reminder =" +rem);

}



}
