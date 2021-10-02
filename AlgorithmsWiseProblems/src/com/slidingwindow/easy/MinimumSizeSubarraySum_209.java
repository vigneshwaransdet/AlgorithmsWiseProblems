package com.slidingwindow.easy;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum_209 {
	@Test
	public void test1() {
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		Assert.assertEquals(2, toFindMinimumSizeSubarraySum(nums,target));
	}

	private int toFindMinimumSizeSubarraySum(int[] nums,int k) {
		int windowStart=0,minWindowSize=Integer.MAX_VALUE,currentWindowSum=0;
		for (int windowEnd=0; windowEnd < nums.length; windowEnd++) {
			currentWindowSum += nums[windowEnd];
			while(currentWindowSum>=k) {
				minWindowSize = Math.min(minWindowSize, windowEnd-windowStart+1);
				currentWindowSum -= nums[windowStart];
				windowStart++;
			}
		}
		return minWindowSize;
	}
}
