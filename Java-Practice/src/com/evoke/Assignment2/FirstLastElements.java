package com.evoke.Assignment2;
import java.util.Arrays;

public class FirstLastElements {
	public static void Elements() {
		int[] myarray = { 1, 2, 3, 5, 6, 7, 8, 9, 1 };
		int[] anotherarray = { 1, 2, 3, 5, 6, 7, 8, 9, 10,12 };

		   System.out.println("myarray  : "+ Arrays.toString(myarray));     
		   System.out.println("anotherarray  : "+Arrays.toString(anotherarray));     

		System.out.println("length of array is : " + myarray.length);
		System.out.println("length of array is : " + anotherarray.length);

		int i = myarray.length;
		int j = anotherarray.length;

		System.out.println(i >= 3 && myarray[0] == myarray[i - 1]);
		System.out.println(j >= 3 && anotherarray[0] == anotherarray[i - 1]);

	}
}


