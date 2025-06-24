package com.program.s1.oops.part2;

abstract class Ramu {

	void go() {
		System.out.println("go");
	}

	abstract void gone(); // method declaration

}

class Test extends Ramu {

	@Override
	void gone() { // define the method

		System.out.println("gone");
	}

}

public class AbstractionSample {

	public static void main(String[] args) {

		Test ob = new Test();
		
		ob.go();
		ob.gone();

	}

}

// Abstraction  - It is the mechanism of hiding the implementation details from the user & showing only essential feature

// abstract is the keyword

// we can use abstract keyword in front of the classes , method

// the declared method should be abstract method

// Abstract class must be a super class

// can't create instance or object for abstract class
