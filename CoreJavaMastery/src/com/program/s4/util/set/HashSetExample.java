package com.program.s4.util.set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        // Create a HashSet of country names
        HashSet<String> countries = new HashSet<>();

        // Adding elements to the HashSet
        countries.add("India");
        countries.add("America");
        countries.add("China");
        countries.add("England");
        // Duplicate element, will not be added
        countries.add("India");
        countries.add(null); // null is allowed once in HashSet
        countries.add(null); // will be ignored as duplicate

        // Adding a new country
        boolean isAdded = countries.add("Saudi Arabia");

        System.out.println("HashSet contents: " + countries);

        // Check if a specific country is present
        if (countries.contains("Sri Lanka")) {
            System.out.println("Sri Lanka is present.");
        } else {
            System.out.println("Country is not available.");
        }

        // Remove a country from the HashSet
        countries.remove("China");

        System.out.println("After removing China: " + countries);
    }

    /*
     * Notes:
     * - HashSet contains only unique elements.
     * - The order of elements is not guaranteed.
     * - Internally, HashSet uses a HashMap to store elements.
     * - Use case: Useful for eliminating duplicates, e.g., in reports.
     */
}
