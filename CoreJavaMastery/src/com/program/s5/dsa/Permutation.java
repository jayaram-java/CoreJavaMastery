package com.program.java.dsa;

public class Permutation {

	private static void permute(String input, String result) {

		if (input.length() == 0) {
			System.out.println(result + " ");
			return;
		}

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			String restOfString = input.substring(0, i) + input.substring(i + 1);
			//System.out.println(restOfString);
			permute(restOfString, result + ch);
		}

	}

	public static void main(String[] args) {

		String s = "ABC";

		permute(s, "");

	}

}
