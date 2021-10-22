package com.evoke.Assignment1;

public class RevStrings {

	public void StringInput(String inputstring) {

		// System.out.println("Enter any String = ");

		// TODO Auto-generated method stub
		// Scanner Sc = new Scanner(System.in);

		// char[] letters = Sc.nextLine().toCharArray();
		char[] letters = inputstring.toCharArray();

		System.out.println("The reverse string of input  is:");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);

		}
		System.out.println();
	}

	public void StringName(String string) {
		// TODO Auto-generated method stub
		String name = "niharika";
		System.out.println("name : " + name);

		int length = name.length();
		System.out.println("length of the name :  " + name.length());
		System.out.println("The reverse string is :");

		for (int i = length - 1; i <= name.length(); i--) {
			if (i >= 0 && i <= 8) {

				char rev = name.charAt(i);

				System.out.print(rev + " ");
			}

		}
	}

}
