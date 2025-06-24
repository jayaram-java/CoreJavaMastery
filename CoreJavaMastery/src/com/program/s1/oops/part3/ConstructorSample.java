package com.program.s1.oops.part3;

public class ConstructorSample {
	
	public ConstructorSample() { // constructor //  special method
		System.out.println("default constructor");
		
		
	}
	
	void go() { // method
		System.out.println("Go");
	}

	public static void main(String[] args) {

		ConstructorSample ob = new ConstructorSample();
		
		ob.go();

	}

}

// Constructor name is same as class name. 

// It does not have a return type, not even void

// Constructor called automatically when creates the object.
