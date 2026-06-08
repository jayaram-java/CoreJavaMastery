package com.program.s7.dsa;

import java.util.Arrays;

public class SortColor {

	public void sortColors(int[] nums) {
		int low = 0, high = nums.length - 1;

		// Use a for loop to iterate with mid as the moving pointer
		for (int mid = 0; mid <= high;) {
			if (nums[mid] == 0) {
				// Swap with low pointer
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				// Leave 1s in the middle
				mid++;
			} else { // nums[mid] == 2
				// Swap with high pointer
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				// Do NOT increment mid here — need to recheck swapped value
			}
		}
	}

	public static void main(String[] args) {

		SortColor obj = new SortColor();

		int[] nums = { 2, 0, 2, 1, 1, 0 };

		System.out.println("Before Sorting: " + Arrays.toString(nums));

		obj.sortColors(nums);

		System.out.println("After Sorting:  " + Arrays.toString(nums));

	}

}
