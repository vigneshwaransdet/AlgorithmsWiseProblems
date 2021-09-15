package com.kishore.interview;

import org.junit.Assert;
import org.junit.Test;

public class Problem3_01 {
	@Test
	public void test1() {
		int[] nums = { 51, 71, 17, 42 };
//		Assert.assertEquals(toFindMaxNumberUsingBruteForce(nums), 93);
		Assert.assertEquals(toFindMaxNumberUsingOptimized(nums), 93);
	}

	@Test
	public void test2() {
		int[] nums = { 42, 43, 60 };
//		Assert.assertEquals(toFindMaxNumberUsingBruteForce(nums), 102);
		Assert.assertEquals(toFindMaxNumberUsingOptimized(nums), 102);
	}

	@Test
	public void test3() {
		int[] nums = { 51, 32, 43 };
//		Assert.assertEquals(toFindMaxNumberUsingBruteForce(nums), -1);
		Assert.assertEquals(toFindMaxNumberUsingOptimized(nums), -1);
	}

//	private int toFindMaxNumberUsingBruteForce(int[] nums) {
//		int res=0,max=0,s1=0,s2=0;
//		for (int i = 0; i < nums.length; i++) {
//			s1=0;s2=0;
//			for (int j = i+1; j < nums.length; j++) {
//				s1 = digitsSum(nums[i]);
//				s2 = digitsSum(nums[j]);
//				if(s1==s2) {
//					res=nums[i]+nums[j];
//					max = Math.max(res, max);
//					break;
//				}
//				else res=-1;
//			}
//		}
//		return max==0 ? res : max;
//	}
//	
//	public int digitsSum(int var) {
//		int sum=0;
//		while(var>0) {
//			int rem = var%10;
//			sum+=rem;
//			var = var/10;
//		}
//		return sum;
//	}

	private int toFindMaxNumberUsingOptimized(int[] nums) {
		int left = 0, right = 1, s1 = 0, s2 = 0, res = 0, max = 0;
		while (left < nums.length) {
			if(left==0 && right>nums.length-1) return -1;
			s1 = 0;
			s2 = 0;
			s1 = digitsSum(nums[left]);
			s2 = digitsSum(nums[right]);
			if (s1 == s2) {
				res = nums[left] + nums[right];
				max = Math.max(res, max);
				left++;
				right = left+1;
				break;
			} else
				res = -1;
			right++;
		}
		return max == 0 ? res : max;
	}

	public int digitsSum(int var) {
		int sum = 0;
		while (var > 0) {
			int rem = var % 10;
			sum += rem;
			var = var / 10;
		}
		return sum;
	}
}
