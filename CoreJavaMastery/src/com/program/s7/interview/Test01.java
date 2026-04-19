package com.program.s7.interview;
import java.util.*;

public class Test01 {  // Fixed Size Window (Subarray Sum)
    public static void main(String[] args) {

        int arr[] = {8, 1, 3, 4, 6};
        int k = 3;

        int max = 0;
        int sum = 0;
        int left = 0;

        List<Integer> subArray = new ArrayList<>();

        for (int right = 0; right < arr.length; right++) {

            // 🔹 EXPAND window
            sum += arr[right];

            // 🔹 Window size reached k
            if (right - left + 1 == k) {

                // Update max
                if (sum > max) {
                    max = sum;

                    // store subarray
                    subArray.clear();
                    for (int i = left; i <= right; i++) {
                        subArray.add(arr[i]);
                    }
                }

                // 🔹 SHRINK window
                sum -= arr[left];
                left++;
            }
        }

        System.out.println("Max Sum: " + max);
        System.out.println("Subarray: " + subArray);
    }
}


// two  pointer algorithm (expand , shrinking) 

// sliding windows (sub array) 