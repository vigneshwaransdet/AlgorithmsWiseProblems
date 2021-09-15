package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;


public class SplitAStringInBalancedStrings_1221 {
	@Test
	public void test1() {
		String s = "RLRRLLRLRL";
		Assert.assertEquals(toSplitAStringInBalancedStrings(s), 4);
	}
	
	@Test
	public void test2() {
		String s = "RLLLLRRRLR";
		Assert.assertEquals(toSplitAStringInBalancedStrings(s), 3);
	}
	
	@Test
	public void test3() {
		String s = "LLLLRRRR";
		Assert.assertEquals(toSplitAStringInBalancedStrings(s), 1);
	}
	
	@Test
	public void test4() {
		String s = "RLRRRLLRLL";
		Assert.assertEquals(toSplitAStringInBalancedStrings(s), 2);
	}

	private int toSplitAStringInBalancedStrings(String s) {
		int left=0,rC=0,lC=0,c=0;
		while(left<s.length()) {
			if(s.charAt(left++)=='R') rC++;
			else lC++;
			if(rC==lC) c++;
		}
		return c;
	}

}
