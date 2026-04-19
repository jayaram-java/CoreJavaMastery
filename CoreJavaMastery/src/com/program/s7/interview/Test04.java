package com.program.s7.interview;

import java.util.HashMap;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		Map<Character, Integer> map = new HashMap<>();

		// Step 1: Store frequency of characters in t
		for (char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int left = 0;
		int right = 0;

		int count = t.length(); // 👉 total characters to match
		int minLen = Integer.MAX_VALUE;
		int start = 0;

		// 👉 EXPAND window
		while (right < s.length()) {

			char current = s.charAt(right);

			// 👉 If character is needed, decrease count
			if (map.containsKey(current)) {
				if (map.get(current) > 0) {
					count--;
				}
				map.put(current, map.get(current) - 1);
			}

			// 👉 When all characters matched
			while (count == 0) {

				// 👉 Update minimum window
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					start = left;
				}

				char leftChar = s.charAt(left);

				// 👉 SHRINK window
				if (map.containsKey(leftChar)) {
					map.put(leftChar, map.get(leftChar) + 1);

					// 👉 If removing breaks validity
					if (map.get(leftChar) > 0) {
						count++;
					}
				}

				left++; // move left pointer
			}

			right++; // move right pointer
		}

		if (minLen == Integer.MAX_VALUE) {
			System.out.println("");
		} else {
			System.out.println(s.substring(start, start + minLen));
		}
	}

}

// Time Complexity
//O(n) (

/*
Step 1: Expand right

right = 0 → 'A'
'A' needed → map[A]=1 > 0 → count--
count = 2
map = {A=0, B=1, C=1}

------------------------------------------

right = 1 → 'D'

Not needed → ignore
count = 2

------------------------------------------------

right = 2 → 'O'
Not needed → ignore

------------------------------------------

right = 3 → 'B'

'B' needed → count--
count = 1
map = {A=0, B=0, C=1}

---------------------------------------------

right = 4 → 'E'
Ignore

----------------------------------------

right = 5 → 'C'

'C' needed → count--
count = 0 ✅ (VALID WINDOW FOUND)
map = {A=0, B=0, C=0}

-------------------------------------------- Now SHRINK (left moves)

Window = "ADOBEC" (0 → 5)

minLen = 6

left = 0 → 'A'

Removing 'A'
map[A] becomes 1 → now missing 'A'
count = 1 ❌ (window invalid)

Stop shrinking

Continue Expanding

right = 6 → 'O'

Ignore

right = 7 → 'D'

Ignore

right = 8 → 'E'

Ignore

right = 9 → 'B'

Extra 'B'
map[B] becomes -1 (extra)
count unchanged

right = 10 → 'A'

'A' needed → count--
count = 0 ✅
map[A]=0

---------------------------------------------- SHRINK again

left moves from 1 → 5

Skip useless chars:

D → ignore
O → ignore
B → map[B] becomes 0 (still ok)
E → ignore


left = 5 → 'C'
Removing 'C'
map[C] becomes 1 → missing C
count = 1 ❌

👉 Stop shrinking

Continue
right = 11 → 'N'

Ignore

right = 12 → 'C'
'C' needed → count--
count = 0 ✅

FINAL SHRINK

Move left:

left = 6 → 'O' → ignore
left = 7 → 'D' → ignore
left = 8 → 'E'

Ignore

left = 9 → 'B'

Removing B
map[B]=1 → count=1 ❌ (invalid)

Before breaking, we check:

Window = "BANC" (9 → 12)
minLen = 4 ✅ (BEST)

FINAL RESULT

"BANC"

*/




