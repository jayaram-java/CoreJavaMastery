package com.program.s2.core.lang.thread;

public class Test extends Thread {

	public void run() {

		for (int i = 0; i <= 5; i++) {

			System.out.println(Thread.currentThread() + " count = " + i);

		}

	}

	public static void main(String[] args) {

		Test ob = new Test();

		ob.start(); // first thread // Thread - 0

		try {
			ob.join(); // waits for a thread to die
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		Test ob1 = new Test();

		ob1.start(); // Thread - 1

		try {
			ob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Test ob2 = new Test();

		ob2.start(); // Thread - 2

	}

}
