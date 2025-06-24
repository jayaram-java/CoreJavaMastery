package com.program.s4.util.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> countries = new LinkedList<String>();
		
		countries.add("India");
		countries.add("China");
		countries.add("Japan");
		countries.add("Taiwan");
		countries.add("Southi Arabia");
		
		System.out.println("Original list : "+countries);
		
		countries.addFirst("Australia");
		
		countries.addLast("France");
		
		countries.add(2,"Brazil");
		
		System.out.println("After additions: "+ countries);
		
		

	}

}


// Properties

// LinkedList internally uses a doubly linked list to store the element.
//- Allows heterogeneous data types
//- Allows null values
//- Allows duplicate elements
//- Maintains insertion order
// use case : lots of insertion / deletions in the middle.