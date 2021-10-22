package com.evoke.Assignment2;

public class TwoFloatingpoints {
	
		public static void FloatingNumb() {
			
				double x = 25586;
				double y = 25589;
				System.out.println(" floating point number: " +x);
				System.out.println(" floating point another number: " +y);

				x = x / 1000;

				y = y / 1000;

				if (x == y) {
					System.out.println("the result is :" +"They are the same up to three decimal places");
				} 
				else {
					System.out.println("the result is :" +"They are different");
				}
			}
	}


