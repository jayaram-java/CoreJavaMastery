/**
 * 
 */
package com.program.s4.util.function;

import java.util.function.Supplier;
import java.util.stream.Stream;

// Supplier – generate()
// Used to supply values, no input
public class SupplierEx {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () -> (int)(Math.random() * 100);
		
		Stream.generate(supplier)
	      .limit(5)
	      .forEach(System.out::println);

	}

}

// Method: T get()