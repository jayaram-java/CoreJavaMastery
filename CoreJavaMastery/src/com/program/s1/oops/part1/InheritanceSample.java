package com.program.s1.oops.part1;

public class InheritanceSample {

	public static void main(String[] args) {

	/*	A1 ob1 = new A1();
		
		ob1.addition(20, 30);
		
		B1 ob2 = new B1();

		ob2.multiplication(5, 5);*/
		
		C1 ob3 = new C1();
		
		ob3.addition(40, 60);
		
		ob3.multiplication(3, 4);
		
		ob3.subtration(45, 15);
		
		B2 ob4 = new B2();
		
		ob4.go();
		ob4.good();
		
		C2 ob5 = new C2();
		
		ob5.go();
		ob5.gone();
	}

}

// the properties of one class can be inherited by the other.
// control the object creation
// Create object at the sub class for all above super class use extends keyword