package com.program.s7.interview;

import java.util.HashMap;
import java.util.Map;

public class Test05 {

	public static void main(String[] args) {

		int arr[] = { 100, 5, 20, 8};
		
		int highest = 0;
		int secondHighest =0;
		
		for(int num : arr) {
			
			if(num > highest) {
				secondHighest = highest;
				highest = num;
			}else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}
			
		}

		System.out.println(secondHighest);
	}

}
