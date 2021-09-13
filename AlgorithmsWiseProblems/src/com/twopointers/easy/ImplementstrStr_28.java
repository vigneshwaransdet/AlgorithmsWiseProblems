package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;


public class ImplementstrStr_28 {
	@Test
	public void test1() {
		String haystack = "hello", needle = "ll";
		Assert.assertEquals(2,toImplementstrStr(haystack,needle));
	}
	
	@Test
	public void test2() {
		String haystack = "aaaaa", needle = "bba";
		Assert.assertEquals(-1,toImplementstrStr(haystack,needle));
	}
	
	@Test
	public void test3() {
		String haystack = "", needle = "";
		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
	}
	
	@Test
	public void test4() {
		String haystack = "a", needle = "";
		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
	}
	
	@Test
	public void test5() {
		String haystack = "a", needle = "a";
		Assert.assertEquals(0,toImplementstrStr(haystack,needle));
	}
	
	@Test
	public void test6() {
		String haystack = "abc", needle = "c";
		Assert.assertEquals(2,toImplementstrStr(haystack,needle));
	}
	
	@Test
	public void test7() {
		String haystack = "aaa", needle = "aaaa";
		Assert.assertEquals(-1,toImplementstrStr(haystack,needle));
	}
	@Test
	public void test8() {
		String haystack = "mississippi", needle = "issip";
		Assert.assertEquals(4,toImplementstrStr(haystack,needle));
	}

	private int toImplementstrStr(String actualString, String pattern) {
		int index = actualString.indexOf(pattern);
		return index;
	}
}
