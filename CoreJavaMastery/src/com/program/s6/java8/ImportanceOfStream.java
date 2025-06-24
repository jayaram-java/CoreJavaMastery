package com.program.s6.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImportanceOfStream {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);
	}

	public void part() {

		List<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		List<Integer> evenNumbers = new ArrayList<>();

		for (Integer number : numbers) {
			if (number % 2 == 0) {
				evenNumbers.add(number);
			}
		}

		for (Integer even : evenNumbers) {
			System.out.println(even);
		}
	}

}
