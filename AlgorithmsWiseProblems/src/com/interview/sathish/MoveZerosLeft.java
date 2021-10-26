package com.interview.sathish;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class MoveZerosLeft {
	@Test
	public void test1() {
		int[] nums = {0,2,1,0,0,3,4};
		Assert.assertTrue(Arrays.equals(new int[] {0,0,0,1,2,3,4}, toMoveZerosLeft(nums)));
	}
	
	@Test
	public void test2() {
		int[] nums = {1,0,0,1,0,0};
		Assert.assertTrue(Arrays.equals(new int[] {0,0,0,0,1,1}, toMoveZerosLeft(nums)));
	}
	
	@Test
	public void test3() {
		int[] nums = {0,1,0,0,3};
		Assert.assertTrue(Arrays.equals(new int[] {0,0,0,1,3}, toMoveZerosLeft(nums)));
	}

	private int[] toMoveZerosLeft(int[] nums) {
		int left=0,right=nums.length-1;
		while(left<right) {
			if(nums[left]==0 && nums[right]!=0) {
				left++;right--;
			}else if(nums[left]!=0 && nums[right]!=0) {
				right--;
			}else if(nums[left]!=0 && nums[right]==0){
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;right--;
			}else {
				left++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
