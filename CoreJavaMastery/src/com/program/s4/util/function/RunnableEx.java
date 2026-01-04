/**
 * 
 */
package com.program.s4.util.function;

// Runnable – Multithreading
// Functional Interface used with lambda
public class RunnableEx {

	public static void main(String[] args) {

		Runnable task = () -> System.out.println("Thread running");

		new Thread(task).start();

	}

}

// Streams = Data + Functional Interfaces