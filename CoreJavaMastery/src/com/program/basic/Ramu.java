package com.program.basic;

public class Ramu {

	public static int add() {

		System.out.println("Static method");

		return 10;
	}

	public static double add(double a, double b) {

		double output = a + b;

		return output;
	}

	public boolean isEligible() {

		System.out.println("This is non static method");

		return true;
	}

	public static void main(String[] args) {

		//int result = add();
		
		double result1 = add(10.7, 12.6);
		
		System.out.println(result1);
		
	//	int a = 10;

		Ramu ob = new Ramu();

		ob.isEligible();

	}

}

/*
main() is static so that the JVM can invoke it without creating an object,
 making it a reliable entry point for program execution.


Use static ➝ static for:

Utility methods
Constants
Common helpers

Use non-static methods for:

Business logic
Data handling
Object-based behavior*/

