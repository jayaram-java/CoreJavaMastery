package com.program.s1.oops.part1;

public class A4 { // Overloading | compile time polymorphism

	public void go(int a) {
		System.out.println("It has single param a =" + a);
	}

	protected static int go(int a, int b) {

		int result = a + b;

		System.out.println("It has two params a = " + a + " b = " + b);

		return result;
	}

	private char go(int a, float b) {

		System.out.println("It has two params a = " + a + " b = " + b);

		return 'A';
	}

	public static void main(String[] args) {
		
		A4 ob = new A4();
		
		ob.go(30);
		
		ob.go(20, 30.5f);
		
		go(30, 40);

	}

}

// It happens in same class
// Method name must be same.
// Parameter must be different
// Access specifier can be different
// Static method can be overload
// return type can be different
//  final , private can be overload
