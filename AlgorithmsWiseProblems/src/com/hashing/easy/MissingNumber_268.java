package com.hashing.easy;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber_268 {
	@Test
	public void test1() {
		int[] nums = {3,0,1};
		Assert.assertEquals(2, missingNumber(nums));
	}

//	private int missingNumber(int[] nums) {
//		Arrays.sort(nums);
//		int i=0;
//		for (i = 0; i < nums.length; i++) {
//			if(i!=nums[i]) {
//				break;
//			}
//		}
//		return i;
//	}
	
	private int missingNumber(int[] nums) {
		int actualSum = 0;
		for (int i = 0; i <= nums.length; i++) {
			actualSum += i;
		}
		
		int numSum = 0;
		for (int i = 0; i < nums.length; i++) {
			numSum += nums[i];
		}
		return actualSum - numSum;
	}
}
