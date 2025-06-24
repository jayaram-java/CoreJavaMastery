package com.program.s1.oops.part3;

public class Test { // Constructor overload | parameterized constructor

	public Test() {
		super();
		System.out.println("Default constructor");
	}

	public Test(String name) {
		this();
		System.out.println("The value is " + name);
	}

	public Test(double d) {
		this("growth");
		System.out.println("The value is " + d);

	}

	public Test(int x) {
		this(2.5);
		System.out.println("The value is " + x);
	}

	public static void main(String[] args) {

		// Test ob = new Test();

		// Test ob1 = new Test("india");

		// Test ob2 = new Test(10.5);

		Test ob3 = new Test(15);

	}

}

// this - > to access the global variable of the current class
// this() -> to access the current class constructor

// super() -> to access the super class constructor