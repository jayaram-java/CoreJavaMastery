package com.program.s1.oops.part3;

public class SingletonSample {

	private static SingletonSample singletonInstance; // declare

	private static int num;

	private SingletonSample() {
		super();
		System.out.println("Constructor called");
	}

	public double go() {

		return 2.5;
	}

	public static SingletonSample getInstance() {

		if (singletonInstance == null) {
			singletonInstance = new SingletonSample();
		}

		return singletonInstance;

	}

	public static void main(String[] args) {

		/*
		 * SingletonSample ob = new SingletonSample();
		 * 
		 * SingletonSample ob1 = new SingletonSample();
		 * 
		 * if (ob == ob1) { System.out.println("Both objects are same"); } else {
		 * System.out.println("Both objects are not same"); }
		 */

		SingletonSample ob = getInstance();

		SingletonSample ob1 = getInstance();

		if (ob == ob1) {
			System.out.println("Both objects are same");
		} else {
			System.out.println("Both objects are not same");
		}

	}

}

//Singleton constructor is private

//Object creation is controlled inside the class

//Instance is stored in a static variable

//Access is given via a public static method


// To restrict object creation from outside and ensure only one instance exists.
