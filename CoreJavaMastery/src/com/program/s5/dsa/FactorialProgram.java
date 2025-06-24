package com.program.s5.dsa;

public class FactorialProgram {

	public static void main(String[] args) {
		int fact = factorialRecursive(10);
		// 10!=10×9×8×7×6×5×4×3×2×1=3,628,800
		System.out.println(fact);
	}
	

	public static int factorialRecursive(int n) {
		if (n == 0 || n == 1) {
			return 1; // Base case: factorial of 0 or 1 is 1
		} else {
			return n * factorialRecursive(n - 1); // Recursive case
		}
	}

}
