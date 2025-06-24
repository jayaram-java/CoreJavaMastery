package com.program.s2.core.lang.basic;

public class StringConcepts {
	
	// Inbuild methods starts

	public static void main(String[] args) {
		
		String a =  "Java";
		
		String b = "HighLevel"; // 9
		
		
		System.out.println("Before swapping = "+a+" "+b);
		
		a = a + b; //JavaHighLevel // 13
		
		
		b = a.substring(0,a.length()-b.length()); // a.substring(0,4) // Java // 4
		
		a = a.substring(b.length()); // a.substring(4) // HighLevel
		
		System.out.println("After swapping = "+a + " "+b);

	}

}
