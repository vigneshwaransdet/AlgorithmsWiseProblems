package com.hashing.easy;

import org.junit.Assert;
import org.junit.Test;

public class SubstringsOfSizeThreeWithDistinctCharacters_1876 {
	@Test
	public void test1() {
		String s = "xyzzaz";
		Assert.assertEquals(1,toFindSubstringsOfSizeThreeWithDistinctCharacters(s));
	}
	
	@Test
	public void test2() {
		String s = "aababcabc";
		Assert.assertEquals(4,toFindSubstringsOfSizeThreeWithDistinctCharacters(s));
	}
	
	private int toFindSubstringsOfSizeThreeWithDistinctCharacters(String s) {
		int count = 0,len=0,k=3;
		for (int i = 0; i < s.length()-2; i++) {
			len=0;
			int[] ascii = new int[26];
			for (int j=i; j<k+i; j++) {
				ascii[s.charAt(j)-97]++;
				len++;
				if(ascii[s.charAt(j)-97]>1) {
					break;
				}
				else if(ascii[s.charAt(j)-97]==1 && len==3) {
					count++;
				}
			}
		}
		return count;
	}
}
