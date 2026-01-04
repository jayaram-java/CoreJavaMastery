/**
 * 
 */
package com.program.s4.util.function;

import java.util.List;

// Predicate – filter()
// Used for condition checking

public class PredicateEx {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 15, 20, 25, 30);

		numbers.stream()
	       .filter(n -> n % 2 == 0)   // Predicate<T> // T-> target
	       .forEach(System.out::println);

	}

}

//Explanation
//n -> n % 2 == 0 → Predicate
//Method: boolean test(T t)