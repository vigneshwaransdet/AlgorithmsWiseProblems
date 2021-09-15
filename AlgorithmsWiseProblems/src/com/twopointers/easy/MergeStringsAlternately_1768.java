package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> String1, String 2
 * Output -> String
 * Constraints -> O(n)
 * 
 * Pseudocode:
 * Initialize left = 0, right = 0
 * Iterate the loop until left < word1.length() && right < word2.length()
 * 		res += word1.charAt(left++);
		res += word2.charAt(right++);
 * Check left < word1.length
 * 		Iterate the loop until left < word1.length
 * 			res += word1.charAt(left++);
 * Check right < word2.length
 * 		Iterate the loop until right < word2.length
 * 			res += word2.charAt(right++);
 * 
 * once loop ends
 * return res
 */

public class MergeStringsAlternately_1768 {
	@Test
	public void test1() {
		String word1 = "abc", word2 = "pqr";
		Assert.assertEquals(mergeAlternately(word1,word2), "apbqcr");
	}
	
	public String mergeAlternately(String word1, String word2) {
		int left = 0, right = 0;
		String res = "";
		while (left < word1.length() && right < word2.length()) {
			res += word1.charAt(left++);
			res += word2.charAt(right++);
		}
		while (left < word1.length()) {
			res += word1.charAt(left++);
		}
		while (right < word2.length()) {
			res += word2.charAt(right++);
		}
		return res;
	}
}
