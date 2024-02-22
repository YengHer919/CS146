//Yeng Her
//2.21.2024
//Finds the longest palindrome possible with string

import java.util.HashMap;

class Hw8 {
	public static int longestPalindrome (String s) {
		int length = 0;
		char largestOdd = ' ';
		int max = 0;
		HashMap<Character, Integer> hashbrown = new HashMap<>();

		for (char i: s.toCharArray()) {
			hashbrown.put(i, hashbrown.getOrDefault(i,0)+1);
		}

		for (char i: hashbrown.keySet()) {
			if (hashbrown.get(i) % 2 != 0 && hashbrown.get(i) > max) {
				largestOdd = i;
				max = hashbrown.get(i);
				length = max;
			}
		}

		for (char i: hashbrown.keySet()) {
			if (hashbrown.get(i) % 2 == 0) {
				length += hashbrown.get(i);
			}
		}

		return length;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abbbccccdd"));
	}
}
