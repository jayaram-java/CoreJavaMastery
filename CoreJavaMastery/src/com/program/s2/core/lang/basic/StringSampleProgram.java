package com.program.s2.core.lang.basic;

public class StringSampleProgram {

	public static void main(String[] args) {
		
		// ------------------------------
		// 1. Immutability example
		// ------------------------------

		String ob = "Java ";
		
		ob.concat("Programming language");  // creates new object, ob not changed
		
		System.out.println(ob);
		
		// ------------------------------
		// Method calls
		// ------------------------------
		stringMethods();
		memoryAllocation();
		compareStrings();
		
		
	}

	public static void stringMethods() {
		String firstName = "Ram";

		String lastName = "Mohan";

		String userName = firstName.concat(" ").concat(lastName);

		System.out.println(userName);
		System.out.println(userName.toUpperCase());
		System.out.println(userName.toLowerCase());
		System.out.println(userName.length());
		System.out.println(userName.charAt(2));
		System.out.println(userName.contains("Ram"));
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
	
	// ------------------------------
	// == vs equals()
	// ------------------------------
	public static void compareStrings() {

		String a = "Java";
		String b = new String("Java");

		System.out.println(a == b);        // false (memory comparison)
		System.out.println(a.equals(b));   // true (content comparison)
	}

}

/*
IMPORTANT POINTS:
-----------------
1. String is a sequence of characters.
2. String is immutable – object state cannot be changed.
3. Stored in String Constant Pool (SCP) when created using literals.
4. == compares memory reference.
5. equals() compares content.
6. String class belongs to java.lang package.
*/