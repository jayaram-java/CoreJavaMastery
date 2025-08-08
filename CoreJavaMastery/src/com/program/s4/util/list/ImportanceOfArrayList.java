package com.program.s4.util.list;

import java.util.ArrayList;
import java.util.List;

public class ImportanceOfArrayList {

	public static void main(String[] args) {

		  // Example: Generic ArrayList (Type-safe - only Strings allowed)
        ArrayList<String> countries = new ArrayList<String>();

        countries.add("India");
        countries.add("America");
        countries.add("Japan");
        countries.add("India");

        System.out.println("Original List: " + countries);

        // Insert "China" at index 1
        countries.add(1, "China");

        System.out.println("After inserting 'China' at index 1: " + countries);

        // Call generic and non-generic examples
        ImportanceOfArrayList obj = new ImportanceOfArrayList();
        obj.genericExample();
        obj.nonGenericExample();
		
    
	}
	
	// Example: Generic ArrayList
    public void genericExample() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Generic List (Integer): " + numbers);
    }

	  // Example: Non-generic ArrayList (Raw type - allows heterogeneous data)
    public void nonGenericExample() {
        List mixedList = new ArrayList(); // Raw type - not type-safe

        mixedList.add(10);         // Integer
        mixedList.add("Raja");     // String
        mixedList.add(20.5);       // Double
        mixedList.add('Y');        // Character
        mixedList.add(null);       // null
        mixedList.add("Raja");     // Duplicate

        System.out.println("Non-Generic List (Heterogeneous): " + mixedList);
    }

}

//ArrayList Properties:
//- Allows heterogeneous data types
//- Internally uses dynamic array
//- Allows null values
//- Allows duplicate elements
//- Maintains insertion order
//- Ideal for read/access operations
//- Preferred when frequent index-based access is needed

/*
ArrayList<Integer> numbers = new ArrayList<>();

Here, you're using ArrayList as both the reference type and the object type.
You can only call methods defined in the ArrayList class on numbers.

List<Integer> numbers = new ArrayList<>();

Here, you're using List (an interface) as the reference type and ArrayList as the object type.
You can only call methods that are declared in the List interface (which are implemented by ArrayList). */

/*Best practice in Java is to program to an interface, not an implementation.
It improves flexibility and maintainability.*/



