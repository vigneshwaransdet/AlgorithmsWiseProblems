package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/* Question : 27. Remove Element [Leetcode]
 * Input -> int[] array
 * Output -> int
 * Constraints -> Space Comeplexity -> O(1)
 * 
 * PSeudocode:
 * Initialize index=0, count=0
 * Iterate the array until length of array
 * 		check condition nums[i] !=k
 * 			true nums[index++] = nums[i]
 * 			increment the count
 * return the count
 * Time Complexity -> O(n)
 * Space Complexity -> O(1)
 */

public class RemoveElement_27 {
	@Test
	public void test1() {
		int[] nums = {3,2,2,3};
		int k = 3;
		Assert.assertEquals(toRemoveElement(nums,k), 2);
	}
	
	@Test
	public void test2() {
		int[] nums = {0,1,2,2,3,0,4,2};
		int k = 2;
		Assert.assertEquals(toRemoveElement(nums,k), 5);
	}
	
	@Test
	public void test3() {
		int[] nums = {3,2,2,3,4};
		int k = 3;
		Assert.assertEquals(toRemoveElement(nums,k), 3);
	}

	private int toRemoveElement(int[] nums, int k) {
		int index=0,count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=k) {
				nums[index++] = nums[i];
				count++;
			}
		}
		return count;
	}
}
