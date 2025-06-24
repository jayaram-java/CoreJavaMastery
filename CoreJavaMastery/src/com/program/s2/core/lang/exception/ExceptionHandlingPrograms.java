package com.program.s2.core.lang.exception;

public class ExceptionHandlingPrograms {

	public static void main(String[] args) {

		System.out.println("Start");

		try {
			
			int a[] = new int[5]; // declaration

			a[8] = 10;

			System.out.println(a[3]);

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exeception occurred" + e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured = "+e);
		}

		System.out.println("End");

	}

}



//try block - Monitor the error

// Catch block - throw the exception

// Finally  - Executes code regardless of exception


// Types of exception

// Checked  Exceptions - checked at compile time
// IOException , SQLException

// Unchecked Exception - Checked at runtime

// Arithmetic exception, NullPointer exception , ArrayIndexOutOfBoundsException