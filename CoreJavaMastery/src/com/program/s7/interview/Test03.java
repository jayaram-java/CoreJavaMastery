package com.program.s7.interview;
import java.util.HashMap;
import java.util.Map;

public class Test03 {  // Variable Window (With Constraint / Optimization)

    public static void main(String[] args) {

        int k = 2; // 👉 Maximum number of changes allowed

        String input = "AABBBBBCCD";

        int left = 0;   // 🡨 Left pointer (start of window)
        int right = 0;  // 🡪 Right pointer (end of window)

        int max = 0;        // 👉 Stores maximum valid window length
        int maxFreq = 0;    // 👉 Stores frequency of most repeating character in current window

        // 👉 Map to store frequency of characters inside window
        Map<Character, Integer> map = new HashMap<>();

        // 👉 EXPAND window using right pointer
        while (right < input.length()) {

            char current = input.charAt(right);

            // 🔹 Add current character to window (frequency count)
            map.put(current, map.getOrDefault(current, 0) + 1);

            // 🔹 Track the highest frequency character in current window
            maxFreq = Math.max(maxFreq, map.get(current));

            // 👉 Current window size
            int windowLength = right - left + 1;

            // 👉 SHRINK window if it becomes invalid
            // Condition: characters to replace > k
            // (windowLength - maxFreq) = number of replacements needed
            while (windowLength - maxFreq > k) {

                char leftChar = input.charAt(left);

                // 🔹 Remove leftmost character from window
                map.put(leftChar, map.get(leftChar) - 1);

                // 🔹 Move left pointer (shrink window)
                left++;

                // 🔹 Recalculate window length after shrinking
                windowLength = right - left + 1;
            }

            // 👉 Update maximum valid window size
            max = Math.max(max, right - left + 1);

            // 👉 Move right pointer (EXPAND)
            right++;
        }

        // Output result
        System.out.println("Max Length: " + max);
    }
}