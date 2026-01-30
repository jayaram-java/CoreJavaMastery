package com.program.s4.util.function.other;

public class HelloGreeting implements Greeting {

	@Override
	public void sayHello() {

		System.out.println("Hello from normal class");

	}

	public static void main(String[] args) {

		HelloGreeting ob = new HelloGreeting();

		ob.sayHello();

	}
}
