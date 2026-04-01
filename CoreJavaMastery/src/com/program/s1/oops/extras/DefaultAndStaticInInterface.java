package com.program.s1.oops.extras;

interface Default {

	void animal();

	default void run() { // has body, can be overriden , called via object
		System.out.println("It is default run");
	}

	static void sleep() { // Has body , cannot be overridden, called via interface name
		System.out.println("Sleeping");
	}
}

class Dog implements Default {

	@Override
	public void animal() {

		System.out.println("dog");
	}

}

public class DefaultAndStaticInInterface {

	public static void main(String[] args) {

		Default default1 = new Dog();

		default1.animal();
		default1.run();

		Default.sleep();

	}

}
