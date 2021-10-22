package com.evoke.Reference;

public class IndexPosition {
	public static void CharacterPosition() { // public char charAt (int index)
		String s1 = "Finding index position";
		String s2 = "Printing Even character";
		String name="Frequency of a character";
		int i ;
	//	int length = s1.length();
	//	char ch = s1.charAt(6);
		System.out.println("String length : " + s1.length());
		System.out.println("character at 6th  place : " + s1.charAt(6));
		for (i = 0; i <= s1.length(); i++) {
			if (i % 2 == 0)
				System.out.println("char at " + i + " place : " + s2.charAt(i));
		}
			for (i = 0; i < name.length(); i++) {
	
			if(name.charAt(i) == 'e')
				System.out.println("Frequency of  e : " + i);
			}
			// if(i %2 !=0)
			// System.out.println("char at " + i + " place : " + s2.charAt(i));
			
		}
	}

