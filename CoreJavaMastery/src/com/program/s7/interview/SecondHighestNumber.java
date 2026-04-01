package com.program.s7.interview;

public class SecondHighestNumber {

	public static Integer findSecondHighest(int[] arr) {

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}
		return (secondHighest == Integer.MIN_VALUE) ? null : secondHighest;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 8 };
		System.out.println(findSecondHighest(arr));
	}

}
