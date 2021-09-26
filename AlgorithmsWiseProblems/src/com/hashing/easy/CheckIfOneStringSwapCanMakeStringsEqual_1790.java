package com.hashing.easy;

import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class CheckIfOneStringSwapCanMakeStringsEqual_1790 {
	@Test
	public void test1() {
		String s1 = "bank", s2 = "kanb";
		Assert.assertTrue(toCheckIfOneStringSwapCanMakeStringsEqual(s1, s2));
	}

	@Test
	public void test2() {
		String s1 = "abcd", s2 = "dcba";
		Assert.assertFalse(toCheckIfOneStringSwapCanMakeStringsEqual(s1, s2));

	}

//	private boolean toCheckIfOneStringSwapCanMakeStringsEqual(String s1, String s2) {
//		if (s1.equals(s2))
//			return true;
//		HashSet<Character> hmap = new HashSet<>();
//		for (int i = 0; i < s1.length(); i++) {
//			hmap.add(s1.charAt(i));
//
//		}
//		for (int i = 0; i < s2.length(); i++) {
//			if (!hmap.contains(s2.charAt(i)))
//				return false;
//		}
//		int count = 0;
//		for (int i = 0; i < s1.length(); i++) {
//			if (s1.charAt(i) != s2.charAt(i)) {
//				count++;
//
//			}
//		}
//		return count == 2;
//	}

	// Optimized
	private boolean toCheckIfOneStringSwapCanMakeStringsEqual(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char first[] = s1.toCharArray();
		char second[] = s2.toCharArray();
		int diff = 0;
		int arr[] = new int[2];
		for (int i = 0; i < first.length; i++) {
			if (first[i] != second[i]) {
				diff++;
				if (diff <= 2) {
					arr[diff - 1] = i;
				}
			}
		}
		return diff == 2 && first[arr[0]] == second[arr[1]] && first[arr[1]] == second[arr[0]] || diff == 0;
	}

}
