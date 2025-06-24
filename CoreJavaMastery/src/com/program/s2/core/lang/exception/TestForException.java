package com.program.s2.core.lang.exception;

public class TestForException {

	public static void main(String[] args) {

		System.out.println("Step 1");
		
		try {
		
		int balanceAmount = 1000/0;
		
		System.out.println("Your balance is "+balanceAmount);
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Server is busy. Try later");
		}finally {
			System.out.println("Thank You");
		}
		
		System.out.println("Step 2");

	}

}
