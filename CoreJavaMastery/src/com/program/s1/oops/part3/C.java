package com.program.s1.oops.part3;

class A { // Constructor chain

	public A() {
	//	super();
		System.out.println("A class constructor");
	}

}

class B extends A {

	public B() {
	//	super();
		System.out.println("B class constructor");
	}

}

public class C extends B {

	public C() {
		//super();
		System.out.println("C class constructor");

	}

	public static void main(String[] args) {
		
		C ob = new C();

	}

}

// Object is the super class for all class

// super -> to access the super class member

// super() -> to access the super class constructor