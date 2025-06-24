package com.program.s4.util.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapSampleProgram {

    public static void main(String[] args) {
        
        // Creating a HashMap
        HashMap<Integer, String> ob1 = new HashMap<>();

        // Inserting key-value pairs
        ob1.put(3, "Rahul");
        ob1.put(1, "Raja");
        ob1.put(2, "Raja");
        ob1.put(5, "Virat");
        ob1.put(4, "Rohit");
        ob1.put(null, "abc");     // First null key entry
        ob1.put(null, null);      // Overwrites the previous null key value
        
        String response = ob1.get(5);
        
        System.out.println(response);

        // Display using enhanced for loop
     //   System.out.println("=== Enhanced For Loop ===");
        for (Map.Entry<Integer, String> entry : ob1.entrySet()) {
          //  System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Display using forEach and lambda
      //  System.out.println("\n=== ForEach with Lambda ===");
      //  ob1.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

    /*
     * Notes about HashMap:
     * - Stores data as key-value pairs.
     * - Keys are unique; values can be duplicated.
     * - Allows one null key and multiple null values.
     * - Does NOT maintain insertion order. unordered
     */
}
}