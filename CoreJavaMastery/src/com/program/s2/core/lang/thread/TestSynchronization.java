package com.program.s2.core.lang.thread;

class Table {

	synchronized void printTable(int n) {

		for (int i = 1; i <= 5; i++) {
			
		

			System.out.println(n * i);
			
			try {
				// Let the current thread wait for a short moment
				wait(2000); // wait for 500ms (releases lock temporarily)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Notify another waiting thread to continue
			notify();

		}
		
		

	}

}

class A extends Thread {

	Table t;

	public A(Table t) {
		super();
		this.t = t; // new Table();
	}

	public void run() {
		t.printTable(5);
	}

}

class B extends Thread  {

	Table t;

	public B(Table t) {
		super();
		this.t = t;
	}

	public void run() {
		t.printTable(8);
		
	}

}

public class TestSynchronization {

	public static void main(String[] args) {

		Table obj = new Table();

		A t1 = new A(obj);

		t1.start();

		B t2 = new B(obj);

		t2.start();

	}

}
