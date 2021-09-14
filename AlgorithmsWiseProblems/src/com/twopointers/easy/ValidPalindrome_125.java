package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

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
