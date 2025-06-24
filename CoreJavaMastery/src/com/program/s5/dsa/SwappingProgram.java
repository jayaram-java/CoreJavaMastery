package com.program.s5.dsa;

public class SwappingProgram {

	public static void main(String[] args) {

		int a = 20;
		
		int b = 35;
		
		int temp = 0;
		
		System.out.println("before swapping  a = "+a + " b ="+b);
		
		temp = a;
		a = b;
		b =temp;
		
		System.out.println("After swapping  a = "+a + " b ="+b);

	}

}
