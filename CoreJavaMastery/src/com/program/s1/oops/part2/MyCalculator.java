/**
 * 
 */
package com.program.s1.oops.part2;

/**
 * This class is used for
 *
 * @author Jayaram
 */

public class MyCalculator implements Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		
		MyCalculator ob = new MyCalculator();
		
		ob.add(10, 20);
	}

}
