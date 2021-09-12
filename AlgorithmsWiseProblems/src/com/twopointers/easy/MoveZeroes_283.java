package com.twopointers.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> int[]
 * Output -> int[]
 * Constraints -> Two Pointers
 * 
 * Pseudocode:
 * Initialize left=0,right=0
 * Iterate the loop until right<nums.length
 * 		check if nums[left]==0 && nums[right]!=0
 * 			true initialize temp variable
 * 			swap nums[left] and nums[right]
 * 			increment the left
 * 		else if nums[left]!=0 && nums[right]==0
 * 			true increment the left
 * 		else if nums[left]!=0 && nums[right]!=0
 * 			true increment the left
 * 		increment the right
 * Time Complexity -> O(n)
 * Space Complexity -> O(1)
 */

public class MoveZeroes_283 {
	@Test
	public void test1() {
		int[] nums = {0,1,0,3,12};
		Assert.assertTrue(Arrays.equals(toMoveZeroes(nums), new int[] {1,3,12,0,0}));
	}
	
	@Test
	public void test2() {
		int[] nums = {0};
		Assert.assertTrue(Arrays.equals(toMoveZeroes(nums), new int[] {0}));
	}
	
	@Test
	public void test3() {
		int[] nums = {1};
		Assert.assertTrue(Arrays.equals(toMoveZeroes(nums), new int[] {1}));
	}
	
	@Test
	public void test4() {
		int[] nums = {1,0,1};
		Assert.assertTrue(Arrays.equals(toMoveZeroes(nums), new int[] {1,1,0}));
	}

	@Test
	public void test5() {
		int[] nums = {4,2,4,0,0,3,0,5,1,0};
		Assert.assertTrue(Arrays.equals(toMoveZeroes(nums), new int[] {4,2,4,3,5,1,0,0,0,0}));
	}
	private int[] toMoveZeroes(int[] nums) {
		 int left=0,right=1;
	            while(right<nums.length){
	                if(nums[left]==0 && nums[right]!=0){
	                    int temp = nums[left];
	                    nums[left] = nums[right];
	                    nums[right] = temp;
	                    left++;
	                }
	                else if(nums[left]!=0 && nums[right]==0) {
	                	left++;
	                }
	                else if(nums[left]!=0 && nums[right]!=0) {
	                	left++;
	                }
	                right++;
	            }
	        System.out.println(Arrays.toString(nums));
	        return nums;
	}

}
