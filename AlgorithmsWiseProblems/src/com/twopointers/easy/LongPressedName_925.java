package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName_925 {
	@Test
	public void test1() {
		String name = "alex", typed = "aaleex";
		Assert.assertEquals(findLongPressedName(name,typed),true);
	}

	@Test
	public void test2() {
		String name = "saeed", typed = "ssaaedd";
		Assert.assertEquals(findLongPressedName(name,typed),false);
	}
	
	@Test
	public void test3() {
		String name = "leelee", typed = "lleeelee";
		Assert.assertEquals(findLongPressedName(name,typed),true);
	}
	
	@Test
	public void test4() {
		String name = "laiden", typed = "laiden";
		Assert.assertEquals(findLongPressedName(name,typed),true);
	}
	@Test
	public void test5() {
		String name = "alex", typed = "aaleexa";
		Assert.assertEquals(findLongPressedName(name,typed),false);
	}
	@Test
	public void test6() {
		String name = "pyplrz", typed = "ppyypllr";
		Assert.assertEquals(findLongPressedName(name,typed),false);
	}
	
	private boolean findLongPressedName(String name, String typed) {
		int left=0,right=0;
		if(name.length() > typed.length()) return false;
		
		while(left<name.length() && right<typed.length()) {
			if(name.charAt(left)==typed.charAt(right)) {
				left++;right++;
			}
			else if(left>0 && name.charAt(left-1)==typed.charAt(right)) {
				right++;
			}
			else return false;
		}
		while(right<typed.length()) {
			if(typed.charAt(right)==name.charAt(left-1)) {
				right++;
			}
			else return false;
		}
		return left<name.length() ? false : true;
	}
}
