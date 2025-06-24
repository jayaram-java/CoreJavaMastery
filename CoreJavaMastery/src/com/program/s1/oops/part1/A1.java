package com.program.s1.oops.part1;

public class A1 {  // multilevel inheritance

	public void addition(int a, int b) {

		int result = a + b;
		System.out.println("Addition = " + result);

	}

}

class B1 extends A1 { // b1 is sub classs // a1 is super class

	public void multiplication(int a, int b) {

		int result = a * b;
		System.out.println("multiplication = " + result);

	}

}

class C1 extends B1 { // c1 is sub class // b1 is super class

	public void subtration(int a, int b) {

		int result = a - b;
		System.out.println("subtration = " + result);

	}

}