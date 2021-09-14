package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> String
 * Output -> boolean
 * Constraints -> Two pointers
 * 
 * Pseudocode:
 * Brute Force:
 * Initialize left=0 and right=string length - 1 
 * to convert the string to lower case and store the another string variable
 * Initialize another String variable to store only alphanumeric characters
 * Iterate the loop until left < right
 * check left character != right character
 * 		true return false
 * increment the left and decrement the right
 * 
 * once loop ends
 * return true
 * 
 * Optimized:
 * Initialize i=0 and j=string length - 1 
 * Iterate the loop until left < right
 * 		check i<j && current string character of i != any special characters except alphanumeric
 * 		true i++
 * 		check i<j && current string character of j != any special characters except alphanumeric
 * 		true j--
 * 		check i<j && current string character of i to lower case != current string character of j to lower case
 * 		true return false
 * 
 * loop ends
 * return true
 * 		
 * 
 */

public class ValidPalindrome_125 {
	@Test
	public void test1() {
		String s = "A man, a plan, a canal: Panama";
//		Assert.assertTrue(toFindValidPalindromeUsingBruteForce(s));
		Assert.assertTrue(toFindValidPalindromeUsingOptimized(s));
	}

	@Test
	public void test2() {
		String s = "race a car";
//		Assert.assertFalse(toFindValidPalindromeUsingBruteForce(s));
		Assert.assertFalse(toFindValidPalindromeUsingOptimized(s));
	}

	private boolean toFindValidPalindromeUsingBruteForce(String s) {
		boolean flag = true;
		String lc = s.toLowerCase();
		String res = "";
		int left = 0;
		while (left < lc.length()) {
			if (Character.isLetterOrDigit(lc.charAt(left))) {
				res += lc.charAt(left);
			}
			left++;
		}
		left = 0;
		int right = res.length() - 1;
		while (left < right) {
			if (res.charAt(left) != res.charAt(right)) {
				flag = false;
			}
			left++;
			right--;
		}
		return flag == true ? true : false;
	}

	private boolean toFindValidPalindromeUsingOptimized(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			if (i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
				return false;
			}
		}
		return true;
	}
}
