package com.program.s2.core.lang.basic;

public class StringSampleProgram {

	public static void main(String[] args) {

		String ob = "Java ";
		
		ob.concat("Programming language");
		
		System.out.println(ob);
		
	//	stringMethods();
		
	}

	public static void stringMethods() {
		String firstName = "Ram";

		String lastName = "Mohan";

		String userName = firstName.concat(" ").concat(lastName);

		System.out.println(userName);

		System.out.println(userName.toUpperCase());
	}

	public static void memoryAllocation() {
		// normal way to create the object

		// It will store in heap memory

		String ob = new String("Hello");

		// literal way

		// It will store in string constant pool.

		String ob1 = "Hello";

		String s1 = "India"; // String constant pool

		String s2 = "India"; // String constant pool

		String s3 = new String("India"); // Heap memory

		if (s1 == s3) {
			System.out.println("Same memory location");
		} else {
			System.out.println("Different memory location");
		}
	}

}

// String is a sequence of characters.

// String is immutable. Object state can't be changed.

// Java.lang package

// 