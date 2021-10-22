package com.evoke.Assignment2;
import java.util.Arrays; 
public class IterateAnArray {

	 public static void ElementsIteration() {
	   int[] myarray = {5, 4, 6, 1, 6, 6, 7, 1, 9, 4};
	   int[] newarray = new int[10];     
	 
	   System.out.println("myarray  : "+Arrays.toString(myarray));     
	   
	   for(int i=0; i < myarray.length; i++) {
	    newarray[i] = myarray[i];
	}
	   System.out.println("New Array: "+Arrays.toString(newarray));
	 }
	 }
	 

/*for(int i :myarray) {
    newarray = myarray;
}
*/