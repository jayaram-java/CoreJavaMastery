package com.program.s4.util.map;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {

    public static void main(String[] args) {

        // Creating a LinkedHashMap instance
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Inserting key-value pairs
        map.put(3, "Rahul");
        map.put(1, "Raja");
        map.put(2, "Raja");       // Duplicate value, allowed
        map.put(5, "Virat");
        map.put(4, "Rohit");
        map.put(null, "abc");     // First null key entry
        map.put(null, null);      // Overwrites the previous null key value

        // Displaying entries using forEach and lambda
        System.out.println("\n=== LinkedHashMap Entries ===");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }

    /*
     * Key Points about LinkedHashMap:
     * - Maintains insertion order.
     * - Allows one null key and multiple null values.
     * - Keys must be unique; values can be duplicated.
     */
}
