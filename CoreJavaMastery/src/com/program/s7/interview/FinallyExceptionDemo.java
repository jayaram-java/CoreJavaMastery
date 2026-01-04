/**
 * 
 */
package com.program.s7.interview;

public class FinallyExceptionDemo {

	public static void main(String[] args) {

		try {
			throw new RuntimeException("Exception from try");
		} catch (Exception e) {
			throw new RuntimeException("Exception from catch");
		} finally {
			throw new RuntimeException("Exception from finally");
		}

	}

}
