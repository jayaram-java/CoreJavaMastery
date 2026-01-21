package com.program.s2.core.lang.thread;

public class MultithreadingSample {

	public static void main(String[] args) {

		  // Main thread starts here
		System.out.println("Main thread is running");

	}

}
/*
-------------------------------- CONCEPTS --------------------------------

Process:
A process is a program in execution.
Example: MS Word, Chrome browser

Thread:
A thread is a lightweight sub-process.
A process can contain multiple threads.
Example in MS Word:
- Spell check thread
- Auto-save thread
- UI thread

Multithreading:
Multithreading is the process of executing multiple threads simultaneously
within a single process.
Advantages:
- Better CPU utilization
- Faster execution
- Consumes less memory compared to multiple processes

Thread Life Cycle:
1. New        -> Thread object is created
2. Runnable  -> Thread is ready to run
3. Running   -> Thread scheduler selects the thread
4. Terminated-> Thread execution completed

Thread Creation in Java:
1. By extending Thread class
2. By implementing Runnable interface

------------------------------------------------------------------------
*/