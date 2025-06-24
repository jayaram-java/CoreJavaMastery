package com.program.s5.dsa;

public class StringConcepts {

	public static void main(String[] args) {

		String a = "Java"; // 4

		String b = "HighLevel"; // 9

		System.out.println("Before swapping = " + a + "  " + b);

		a = a + b; // 13

		b = a.substring(0, a.length() - b.length()); // (0,13-9) // (0,4) // 4

		a = a.substring(b.length());

		System.out.println("After swapping = " + a + "  " + b);

	}

}
