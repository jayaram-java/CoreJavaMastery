package com.program.s2.core.lang.thread;

public class Test extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " count = " + i);
        }
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        t1.start(); // Thread-0

        try {
            t1.join(); // wait until Thread-0 completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start(); // Thread-1

        try {
            t2.join(); // wait until Thread-1 completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start(); // Thread-2
    }
}
/*
join()

Makes current thread wait
Used when one thread depends on another
*/