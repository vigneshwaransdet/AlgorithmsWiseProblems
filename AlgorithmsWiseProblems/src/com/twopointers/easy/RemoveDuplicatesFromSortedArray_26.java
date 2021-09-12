package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Question : 26. Remove Duplicates from Sorted Array
 * Input -> int[]
 * Output -> int
 * Constraints -> space Complexity -> O(1) 
 * 
 * Pseudocode:
 * Initialize left=0,right=1,count=1,i=1
 * add 1st element to the 1st index position of array
 * Iterate the while loop until right<nums.length
 * 		check nums[left] != nums[right]
 * 			if true -> nums[i++] = nums[right]
 * 			increment the count
 * 
 * 		increment the right
 * return the count
 * 
 * Time Complexity -> O(n)
 * Space Complexity -> O(1)
 */

public class RemoveDuplicatesFromSortedArray_26 {
	@Test
	public void test1() {
		int[] nums = {1,1,2};
		Assert.assertEquals(toRemoveDuplicatesFromSortedArray(nums), 2);
	}
	
	@Test
	public void test2() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Assert.assertEquals(toRemoveDuplicatesFromSortedArray(nums), 5);
	}
	
	@Test
	public void test3() {
		int[] nums = {};
		Assert.assertEquals(toRemoveDuplicatesFromSortedArray(nums), 0);
	}

	private int toRemoveDuplicatesFromSortedArray(int[] nums) {
		int left=0,right=1,count=1,i=1;
        if(nums.length==0) return 0;
        else if(nums.length>0){
            nums[0] = nums[left];
            while(right<nums.length) {
                if(nums[left]!=nums[right]) {
                    nums[i++] = nums[right];
                    left++;
                    count++;
                }
                right++;
            }
        }
		return count;
	}
	
	
}
