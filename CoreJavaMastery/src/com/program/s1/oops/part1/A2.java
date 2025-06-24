package com.program.s1.oops.part1;

public class A2 { // Hierarchical

	void go() {
		System.out.println("Go - From A2 class");
	}

}

class B2 extends A2{ // sub class 

	void good() {
		System.out.println("Good - From B2 class");
	}

}

class C2 extends A2{ // sub class

	void gone() {
		System.out.println("Gone - From C2 class");
	}

}