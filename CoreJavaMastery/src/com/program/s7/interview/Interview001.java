package com.program.s7.interview;

// changebond
public class Interview001 {

	// // aaaaebbccddddaa -> 4a1e2b2c4d2a

	public static String compress(String input) {

		if (input == null || input.length() == 0)
			return "";

		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result.append(count).append(input.charAt(i - 1));
				count = 1;
			}

		}

		result.append(count).append(input.charAt(input.length() - 1));

		return result.toString();
	}

	public static void main(String[] args) {

		String input = "aaaaebbccddddaa";

		System.out.println(compress(input));

	}

}
