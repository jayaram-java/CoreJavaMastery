package com.program.s2.core.lang.basic;

public class MathClassProgram {

	public static void main(String[] args) {

		double n1 = 64;

		double sqrtResult = Math.sqrt(n1);

		System.out.println(sqrtResult);

		int a = 30;

		int b = 150;

		int maxValue = Math.max(a, b);

		System.out.println(maxValue);

		double value = 7.39;

		long roundValue = Math.round(value);
		
		System.out.println(roundValue);
		
		double randomValue = Math.random();
		
		System.out.println(randomValue);
		
		int a1 = -100;
		
		int absValue = Math.abs(a1);
		
		System.out.println(absValue);
		
	}

}

// Math class provides static methods for performing basic math operations

// It is part of java.lang package