package com.program.s1.oops.part3;

public class SingletonSample {

	private static SingletonSample singletonInstance; // declare

	private static int num;

	public SingletonSample() {
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
