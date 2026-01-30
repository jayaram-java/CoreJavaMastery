package com.program.s4.util.function.other;

public class Test {

	public static void main(String[] args) {

		Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello from anonymous class");
			}
		};

		greeting.sayHello();
	}
}

//An anonymous class is a class without a name.
//It can extend one class OR implement one interface (not both).
//It can have instance variables, but cannot have constructors.
//It can override methods of the class or interface.
//It can access final or effectively final variables from the enclosing scope.
//It was used heavily before Java 8.
//After Java 8, functional interfaces are mostly replaced by lambda expressions, but anonymous classes are still useful when:
//Multiple methods need to be overridden
//State (instance variables) is required