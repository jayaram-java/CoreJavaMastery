package com.program.s1.oops.part1;

public class A3 { // Multiple inheritance

	void go() {
		System.out.println("Go-From A3");
	}

}

class B3 {

	void gone() {
		System.out.println("Gone - From B3");
	}

}

class C3 extends A3,B3{
	
	void good() {
		System.out.println("Good");
	}
}

// Ambiguous problem