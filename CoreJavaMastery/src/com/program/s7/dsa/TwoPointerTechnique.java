package com.program.s7.dsa;

import java.util.Arrays;

public class TwoPointerTechnique {
	
	public int[] twoSum(int[] numbers, int target) {

		for (int left = 0, right = numbers.length - 1; left < right;) {
			int sum = numbers[left] + numbers[right];

			if (sum == target) {

				return new int[] { left + 1, right + 1 };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[] { -1, -1 };
	}
	
	public static void main(String[] args) {

		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;

		TwoPointerTechnique obj = new TwoPointerTechnique();
		int[] result = obj.twoSum(numbers, target);

		System.out.println("Result: " + Arrays.toString(result));
	}

}
