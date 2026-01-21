package com.program.s2.core.lang.thread;

public class Test01 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " Num = " + i);

            try {
                Thread.sleep(1000); // pauses the current thread for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {

        Test01 t1 = new Test01();
        t1.start();
    }
}

/*
sleep():
- sleep() is a static method of Thread class
- It pauses the currently executing thread for a specified time
- Time is always in milliseconds
- It does NOT release the lock
- Throws InterruptedException
*/
