package com.program.basic;

public class A {

	public int addition(int a, int b) {

		int result = a + b;

		return result;
	}

	public static void main(String[] args) {

		A ob = new A();

		int output = ob.addition(10, 40);

		System.out.println("Addition = " + output);

	}

}
