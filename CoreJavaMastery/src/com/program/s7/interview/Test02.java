package com.program.s7.interview;
import java.util.HashSet;
import java.util.Set;

public class Test02 { // Variable Window (Unique Characters)

    public static void main(String[] args) {

        String input = "BACBDEFCGH";

        // Sliding window uses a Set to track unique characters
        Set<Character> set = new HashSet<>();

        int left = 0;   // 🡨 Left pointer (start of window)
        int right = 0;  // 🡪 Right pointer (end of window)

        int max = 0;    // To store max length
        int start = 0;  // To store starting index of result substring

        // 👉 EXPAND window using right pointer
        while (right < input.length()) {

            // 🔹 Take current character from RIGHT (not left)
            char current = input.charAt(right);

            // 👉 SHRINK window if duplicate found
            while (set.contains(current)) {
                set.remove(input.charAt(left)); // remove from left
                left++; // move left pointer forward
            }

            // 👉 Add current character (valid window)
            set.add(current);

            // 👉 Calculate current window length
            int windowLength = right - left + 1;

            // 👉 Update max window
            if (windowLength > max) {
                max = windowLength;
                start = left; // store starting index
            }

            // 👉 Move right pointer (EXPAND)
            right++;
        }

        // Output
        System.out.println("Max Length: " + max);
        System.out.println("Substring: " + input.substring(start, start + max));
    }
}