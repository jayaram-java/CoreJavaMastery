package com.program.s4.util.list;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		  // Primitive variables
        int a = 10;
        int b = 20;
        int c = 30;

        // Array of integers (homogeneous, fixed length)
        int[] d = {10, 20, 30, 5, 15};

        System.out.println("Original : " + Arrays.toString(d));

        // Sort the array
        Arrays.sort(d);

        System.out.println("Sorted   : " + Arrays.toString(d));
        System.out.println("Length   : " + d.length);

        // String array
        String[] c1 = new String[2];
		
		c1[0] = null;
		
	//	System.out.println(c1[0].length());
		
		


	}

}
