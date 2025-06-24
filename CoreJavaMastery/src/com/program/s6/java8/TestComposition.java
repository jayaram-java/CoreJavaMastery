package com.program.s6.java8;

class Engine {

	public Engine() {
		System.out.println("3 cylinder - Petrol engine");
	}

}

class Car {

	private Engine engine;

	public Car() {

		this.engine = new Engine();

	}

}

public class TestComposition {

	public static void main(String[] args) {

		Car ob = new Car(); // Has - a | relationship 

	}
}

// Relationship = Composition represents a "has-a" relationship(Car has an engine).
// Inheritance represents an "Is-a" relationship(Dog is an animal).

// Composition provides more flexibility in modifying or replacing components.
// Inheritance binds classes more tightly, and changes in the base class can affect all derived classes.

