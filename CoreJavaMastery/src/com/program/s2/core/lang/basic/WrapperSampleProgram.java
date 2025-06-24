package com.program.s2.core.lang.basic;

public class WrapperSampleProgram {

	public static void main(String[] args) {
		
		int a = 20; // Primitive data type
		
		Integer j = Integer.valueOf(a); // Object
		
		System.out.println("Autoboxing");
		
		System.out.println(j);
		
		
		System.out.println("-----------------------------------------------------------------------");
		
		Integer ob = 30;  // Object 
		
		int i = ob.intValue(); // Primitive data type
		
		System.out.println("Autounboxing");
		
		System.out.println(i);
		


	}

}


// Wrapper class 

// It has two types. 1. Autoboxing (Primitive data type to object) 2. AutoUnboxing (Object to Primitive data type)