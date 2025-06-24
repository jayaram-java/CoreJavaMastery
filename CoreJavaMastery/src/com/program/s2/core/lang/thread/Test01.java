package com.program.s2.core.lang.thread;

public class Test01 extends Thread {

	public void run() {

		for (int i = 0; i <= 5; i++) {

			System.out.println("Num = " + i);

			try {
				Thread.sleep(1000); // milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Test01 ob = new Test01();

		ob.start();

	}

}

// that pauses the current thread for a specified time.
