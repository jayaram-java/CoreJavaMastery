package com.program.s4.util.set;

import java.util.LinkedHashSet;


public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> countries = new LinkedHashSet<>();

        // Adding elements
        countries.add("India");
        countries.add("America");
        countries.add("China");
        countries.add("England");
        countries.add("India"); // Duplicate, will be ignored
        countries.add(null);    // One null allowed

        for(String country : countries) {
        	
        	System.out.println(country);
        	
        }
        
        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + countries);
    }
}

/**
 * 
 * - Maintains insertion order.
 * - Allows one null value.
 * - Stores only unique elements.
 */