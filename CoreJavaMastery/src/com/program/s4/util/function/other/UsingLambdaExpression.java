package com.program.s4.util.function.other;

public class UsingLambdaExpression {

    public static void main(String[] args) {

        Greeting greeting = () -> System.out.println("Hello from lambda expression");

        greeting.sayHello();
    }
}


//A lambda expression provides a concise way to implement a functional interface.
//Syntax:
//parameter -> expression
//(parameter1, parameter2) -> expression
//(parameters) -> { statements; }
//It represents a block of code that can take parameters and return a value (return is optional for single expressions).
//It reduces boilerplate code compared to anonymous classes.
//Makes code cleaner and more readable.
//Supports functional programming style.
//Works especially well with Streams API and Collections.
//Available from Java 8 onwards.
//Cannot have instance variables or constructors.