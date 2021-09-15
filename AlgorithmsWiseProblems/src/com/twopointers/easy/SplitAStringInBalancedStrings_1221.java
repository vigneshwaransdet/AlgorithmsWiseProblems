package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> String
 * Output -> int
 * Constraints -> O(n)
 * Pseudocode:
 * initialize left=0,rightCount=0,leftCount=0,count=0
 * Iterate the loop until left < s.length()
 * check if s.charAt(left++)=='R'
 * 			true increment the rightCount
 * 		else	
 * 			increment the leftCount
 * 		check rightCount == leftCount
 * 		true increment the count
 * 
 * once loop ends 
 * return count
 * 
 * Time Complexity -> O(n)
 * Space Complexity -> O(1)
 */

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
		int left=0,rightCount=0,leftCount=0,count=0;
		while(left<s.length()) {
			if(s.charAt(left++)=='R') rightCount++;
			else leftCount++;
			if(rightCount==leftCount) count++;
		}
		return count;
	}

}
