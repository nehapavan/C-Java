package com.evoke.Assignment2;

import java.util.Arrays;

public class MergingTwoArrays {
	public static void SortedArrayOfInt() {
	int[] myarray1 = { 1, 2, 3, 4 };
	int[] myarray2 = { 2,5,7,8 };
	
	System.out.println("length of array1 is : " + myarray1.length);
	System.out.println("length of array2 is : " + myarray2.length);
	
    int[] resultarray = new int[myarray1.length + myarray2.length]; 
    
	System.arraycopy(myarray1, 0, resultarray, 0, (myarray1.length));  
	System.arraycopy(myarray2, 0, resultarray, (myarray1.length), (myarray2.length));  
	System.out.println("Result array : " + Arrays.toString(resultarray));    

	}  
}
