package com.program.java.dsa;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberCalcWithoutStream {

	public static void main(String[] args) {

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
