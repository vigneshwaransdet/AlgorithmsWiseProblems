package com.slidingwindow.easy;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum_209 {
	@Test
	public void test1() {
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		Assert.assertEquals(2, toFindMinimumSizeSubarraySum(target,nums));
	}
	
	@Test
	public void test2() {
		int[] nums = {1,4,4};
		int target = 4;
		Assert.assertEquals(1, toFindMinimumSizeSubarraySum(target,nums));
	}
	
	@Test
	public void test3() {
		int[] nums = {1,1,1,1,1,1,1,1};
		int target = 11;
		Assert.assertEquals(0, toFindMinimumSizeSubarraySum(target,nums));
	}


	private int toFindMinimumSizeSubarraySum(int target,int[] nums) {
		int windowStart=0,minWindowSize=Integer.MAX_VALUE,currentWindowSum=0,res=0;
		for (int windowEnd=0; windowEnd < nums.length; windowEnd++) {
			currentWindowSum += nums[windowEnd];
			while(currentWindowSum>=target) {
				minWindowSize = Math.min(minWindowSize, windowEnd-windowStart+1);
				res=minWindowSize;
				currentWindowSum -= nums[windowStart];
				windowStart++;
			}
		}
		return res;
	}
}
