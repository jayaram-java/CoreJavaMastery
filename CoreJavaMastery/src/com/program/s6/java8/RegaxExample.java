package com.program.s6.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegaxExample {

	public static void main(String[] args) {

		String text = "The rain in Spain stays mainly in the plain";

		String patternString = "\\b\\w+ain\\b";

		Pattern pattern = Pattern.compile(patternString);

		Matcher matcher = pattern.matcher(text);

		System.out.println("Matches founds: ");

		while (matcher.find()) {
			System.out.println("Match: " + matcher.group() + " at position " + matcher.start());
		}

	}

}
