package com.program.s1.oops.extras;

// Final class: cannot be extended
final class C {

	public void display() {
		System.out.println("Inside final class C");
	}
}

// Normal class with a final variable and a final method
class A {

	final int a = 100; // Final variable cannot be reassigned

	// Final method: cannot be overridden
	public final void showMessage() {
		System.out.println("Method name is showMessage from A");
	}

	public void go() {
		System.out.println("Go method called");
		System.out.println("Value of final variable a = " + a);
	}
}

// Subclass of A (allowed because A is not final)
class B extends A {

	public void gone() {
		System.out.println("Gone method called from B");
	}

	// Cannot override showMessage() because it's final in class A
}

public class FinalKeywordExample {

	public static void main(String[] args) {
		B ob = new B();

		// Call inherited method from A
		ob.go();

		// Call method specific to B
		ob.gone();

		// Creating an object of final class C and calling its method
		C c = new C();
		c.display();
	}
}
