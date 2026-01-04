/**
 * 
 */
package com.program.s4.util.function;

import java.util.List;

//Function – map()

// Used for data transformation

/*@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
T → Input (argument) type
R → Return (result) type
apply() → Abstract method to implement
*/


public class FunctionEx {

	public static void main(String[] args) {

		List<String> names = List.of("jay", "ram", "kumar");
		
		names.stream()
	     .map(name -> name.toUpperCase())   // Function<T, R>
	     .forEach(System.out::println);
	}

}

//Explanation
//Input: String
//Output: String
//Method: R apply(T t)