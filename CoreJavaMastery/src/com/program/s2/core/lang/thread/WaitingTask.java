package com.program.s2.core.lang.thread;

public class WaitingTask implements Runnable {

	private final Object lock;

	public WaitingTask(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {

		synchronized (lock) {
			try {
				System.out.println("Waiting thread waiting");
				lock.wait(); // releases lock and waits
				System.out.println("Waiting thread resumed");
			} catch (InterruptedException e) {
				System.out.println("Waiting thread interrupted");
			}
		}
	}

	public static void main(String[] args) {

		Object lock = new Object();

		Thread waitingThread = new Thread(new WaitingTask(lock));
		Thread notifyingThread = new Thread(new NotifyingTask(lock));

		waitingThread.start();

		// small delay to ensure waitingThread enters wait()
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		notifyingThread.start();
	}
}

/* ---------------- Notifying Runnable Class ---------------- */

class NotifyingTask implements Runnable {

	private final Object lock;

	public NotifyingTask(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {

		synchronized (lock) {
			System.out.println("Notifying thread notifying");
			lock.notify(); // wakes up waiting thread
		}
	}
}

/*
wait()

Releases the lock
Moves thread to WAITING state
Must be inside synchronized block

notify()

Wakes one waiting thread 
Does NOT release lock immediately
*/