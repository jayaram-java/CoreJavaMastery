package com.program.s7.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static Character findFirstNonRepeated(String input) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return null;
	}

	public static void main(String[] args) {
		String str = "swiss";
		System.out.println(findFirstNonRepeated(str));
	}

}
