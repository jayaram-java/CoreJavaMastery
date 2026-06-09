package com.program.s7.dsa;

public class ContainerWithMostWater {
	
	public int maxArea(int[] height) {
		int maxArea = 0;
		
		for (int left = 0, right = height.length - 1; left < right;) {
			int width = right - left;
			int currentArea = width * Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, currentArea);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		
	}

}
