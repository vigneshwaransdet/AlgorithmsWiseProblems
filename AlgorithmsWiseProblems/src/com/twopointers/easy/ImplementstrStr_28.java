package com.twopointers.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;


public class ImplementstrStr_28 {
	@Test
	public void test1() {
		String haystack = "hello", needle = "ll";
//		Assert.assertEquals(2,toImplementstrStr(haystack,needle));
		Assert.assertEquals(2,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test2() {
		String haystack = "aaaaa", needle = "bba";
//		Assert.assertEquals(-1,toImplementstrStr(haystack,needle));
		Assert.assertEquals(-1,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test3() {
		String haystack = "", needle = "";
//		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
		Assert.assertEquals(0,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test4() {
		String haystack = "a", needle = "";
//		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
		Assert.assertEquals(0,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test5() {
		String haystack = "a", needle = "a";
//		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
		Assert.assertEquals(0,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test6() {
		String haystack = "abc", needle = "c";
//		Assert.assertEquals(2,toImplementstrStr(haystack,needle));
		Assert.assertEquals(2,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test7() {
		String haystack = "aaa", needle = "aaaa";
//		Assert.assertEquals(-1,toImplementstrStr(haystack,needle));
		Assert.assertEquals(-1,toImplementstrStrUsingAscii(haystack,needle));
	}
	@Test
	public void test8() {
		String haystack = "mississippi", needle = "issip";
//		Assert.assertEquals(4,toImplementstrStr(haystack,needle));
		Assert.assertEquals(4,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test9() {
		String haystack = "", needle = "";
//		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
		Assert.assertEquals(0,toImplementstrStrUsingAscii(haystack,needle));
	}
	
	@Test
	public void test10() {
		String haystack = "mississippi", needle = "pi";
//		Assert.assertEquals(9,toImplementstrStr(haystack,needle));
		Assert.assertEquals(9,toImplementstrStrUsingAscii(haystack,needle));
	}

	private int toImplementstrStr(String actualString, String pattern) {
		int index = actualString.indexOf(pattern);
		return index;
	}
	
	private int toImplementstrStrUsingAscii(String actualString, String pattern) {
		int left=0,right=0;
		int[] pAscii = new int[26];
		int[] eAscii = new int[26];
		if(actualString.length()==0 && pattern.length()==0) return 0;
		else if(actualString.length()>=0 && pattern.length()==0) return 0;
		for (int i = 0; i < pattern.length(); i++) {
			pAscii[pattern.charAt(i)-97]++;
		}
		while(right<actualString.length()) {
			if(right-left<pattern.length()) {
				eAscii[actualString.charAt(right)-97]++;
				right++;
 				if(Arrays.equals(pAscii, eAscii)) return left;
			}
			else {
				left++;
				right=left;
				eAscii = new int[26];
			}
		}
		return -1;
	}
}
