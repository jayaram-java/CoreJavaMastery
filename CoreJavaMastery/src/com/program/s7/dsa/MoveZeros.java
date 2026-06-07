package com.program.s7.dsa;

public class MoveZeros {

	public void moveZeroes(int[] nums) {
		int insertPos = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[insertPos];
				nums[insertPos] = nums[i];
				nums[i] = temp;
				insertPos++;
			}
		}
	}

	public static void main(String[] args) {

		MoveZeros ob = new MoveZeros();

		int[] nums = { 0, 1, 0, 3, 12 };

		ob.moveZeroes(nums);

	}

}

//Time Complexity: $O(n)$ — We only traverse the array once (or twice in worst-case overwrite), which is linear time.
//Space Complexity: $O(1)$ — This modifies the array in-place, using no extra memory.