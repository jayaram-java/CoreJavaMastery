/**
 * 
 */
package com.program.s4.util.function;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator calc = (a,b) -> a+b;
		
		System.out.println(calc.add(10, 20));

	}

}
