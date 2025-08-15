package com.program.s6.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Raja");
		names.add("John");
		names.add("Alice");
		names.add("David");

		names.stream().filter(name -> name.length() > 4).map(name -> name.toUpperCase())
				.forEach(name -> System.out.println(name));

		// Source - intermediate - intermediate - terminal
	}

}
