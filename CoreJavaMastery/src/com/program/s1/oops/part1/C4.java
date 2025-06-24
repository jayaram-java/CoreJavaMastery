package com.program.s1.oops.part1;

class B4 {  // override // run time polymorphism

	public void go(int a) {

		System.out.println("go-super class");

	}

}

public class C4 extends B4 {

	public void go(int a) {
		super.go(a);
		System.out.println("go-sub class");
	}

	public static void main(String[] args) {
		
		C4 ob = new C4();
		
		ob.go(10);

	}

}

// It happens in different class
// It must use extends keyword
// method name must be same
// parameter must be same
// access specifier same or wider
// Private , final method can't override
// Static method can't be override because it is a runtime polymorphism
// we can use super keyword. It is used to access immediate super class member
