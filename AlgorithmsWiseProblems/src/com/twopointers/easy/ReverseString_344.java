package com.twopointers.easy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString_344 {
	@Test
	public void test1() {
		char[] s = {'h','e','l','l','o'};
		Assert.assertTrue(Arrays.equals(toReverseString(s), new char[] {'o','l','l','e','h'}));
	}
	
	@Test
	public void test2() {
		char[] s = {'H','a','n','n','a','h'};
		Assert.assertTrue(Arrays.equals(toReverseString(s), new char[] {'h','a','n','n','a','H'}));
	}

	private char[] toReverseString(char[] s) {
		int left = 0, right = s.length-1;
		while(left<=right) {
			char temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
		return s;
	}
	

}
