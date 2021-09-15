package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;


/*
 * Input -> String,int[]
 * Output -> String
 * Constraints -> O(n)
 * 
 * Pseudocode:
 * Initialize the result variable as char[]
 * Iterate the for loop until i<indices.length
 * 		res[indices[i]] = s.charAt()
 * 
 * return the res
 * Time Complexity -> O(n)
 * Space Complexity -> O(n)
 */

public class ShuffleString_1528 {
	@Test
	public void test1() {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		Assert.assertEquals(restoreString(s,indices), "leetcode");
	}
	
	@Test
	public void test2() {
		String s = "aiohn";
		int[] indices = {3,1,4,2,0};
		Assert.assertEquals(restoreString(s,indices), "nihao");
	}
	
	@Test
	public void test3() {
		String s = "aaiougrt";
		int[] indices = {4,0,2,6,7,3,1,5};
		Assert.assertEquals(restoreString(s,indices), "arigatou");
	}
	
	@Test
	public void test4() {
		String s = "art";
		int[] indices = {1,0,2};
		Assert.assertEquals(restoreString(s,indices), "rat");
	}
	
	
	public String restoreString(String s, int[] indices) {
		char[] res = new char[indices.length]; 
		for (int i = 0; i < indices.length; i++) {
			res[indices[i]] = s.charAt(i);
		}
		return String.valueOf(res);
	}
}
