package com.program.s4.util.set;

import java.util.TreeSet;


public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();

        try {
            countries.add("India");
            countries.add("America");
            countries.add("China");
            countries.add("England");
            countries.add("India"); // Duplicate entry, will be ignored
			//countries.add(null);

            System.out.println("TreeSet Response = " + countries);

        } catch (Exception e) {
            System.err.println("An error occurred while working with TreeSet:");
            e.printStackTrace();
        }
    }
}


/**
 *
 * TreeSet maintains elements in sorted order and does not allow duplicates.
 */