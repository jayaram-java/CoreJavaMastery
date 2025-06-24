package com.program.s4.util.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // Creating a PriorityQueue of Integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(20);
        priorityQueue.offer(1);

        // Printing the elements (order is not sorted, but head will be the least)
        System.out.println("PriorityQueue elements: " + priorityQueue);

     
        System.out.println("Polled element: " + priorityQueue.poll());

        // Printing the queue after polling
        System.out.println("PriorityQueue after polling: " + priorityQueue);
    }
}
