package com.program.s4.util.map;

import java.util.TreeMap;

public class TreeMapSampleProgram {

    public static void main(String[] args) {

        TreeMap<Integer, String> ob1 = new TreeMap<>();

        // Inserting key-value pairs
        ob1.put(3, "Rahul");
        ob1.put(1, "Raja");
        ob1.put(2, "Raja");
        ob1.put(5, "Virat");
        ob1.put(4, "Rohit");

        // TreeMap does NOT allow null keys - will throw NullPointerException
        // ob1.put(null, "abc");   //  Uncommenting this will cause runtime error
        // ob1.put(null, null);    //  Same here

        System.out.println("TreeMap contents (sorted by key):");
        System.out.println(ob1);

        System.out.println("\n=== ForEach with Lambda ===");
        ob1.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }

    // Key Points:
    // - TreeMap stores entries sorted by key in natural (ascending) order.
    // - Keys must be unique.
    // - Null keys are NOT allowed in TreeMap (unlike HashMap).
    // - Multiple null values ARE allowed.
}
