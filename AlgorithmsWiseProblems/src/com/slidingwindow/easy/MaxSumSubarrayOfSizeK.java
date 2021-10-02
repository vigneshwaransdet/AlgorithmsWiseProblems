package com.slidingwindow.easy;

import org.junit.Assert;
import org.junit.Test;


public class MaxSumSubarrayOfSizeK {
	@Test
	public void test1() {
		int[] arr = {4,2,1,7,8,1,2,8,1,0};
		Assert.assertEquals(16, toFindMaxSumSubArray(arr));
	}
	
	@Test
	public void test2() {
		int[] arr = {7,8,1,2,8,9,0};
		Assert.assertEquals(19, toFindMaxSumSubArray(arr));
	}

	private int toFindMaxSumSubArray(int[] arr) {
		int maxValue = Integer.MIN_VALUE,currentSum = 0,k=3;
		
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if(i>=k-1) {
				maxValue = Math.max(maxValue, currentSum);
				currentSum -= arr[i-(k-1)];
			}
		}
		return maxValue;
	}

}
