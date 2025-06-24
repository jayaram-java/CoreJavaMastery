package com.program.s2.core.lang.basic;

public class StringProgramsWithMethod {

	public static void main(String[] args) {
		
	//	String is non-primitive data type

		String name = " Virat ";
		
		//System.out.println("Before trim="+name);
		
		String output = name.trim();
		
	//	System.out.println("After trim="+output);
		
		String input = "Java-is-platform-independent";
		
		String a[] = input.split("-");
		
		for(int i=0;i<a.length;i++) {
			
			//System.out.println(a[i]);
			
		}
		
		String firstName = "Ram";
		
		char result = firstName.charAt(1);
		
		System.out.println(result);

	}

}
