/**
 * 
 */
package com.program.s4.util.function;

import java.util.List;

//Consumer – forEach()
// Used for performing action, no return
public class ConsumerEx {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3);

		list.stream().forEach(n -> System.out.println(n)); // Consumer<T>

	}

}

// Method: void accept(T t)