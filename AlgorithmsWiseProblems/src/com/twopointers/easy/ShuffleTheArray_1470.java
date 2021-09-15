package com.twopointers.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> int[]
 * Output -> int[]
 * Constraints -> O(n)
 * 
 * Pseudocode:
 * Initialize left=0,right=n,i=0
 * Declare new int[] array to store the result 
 * Iterate the loop until left < n and right < array.length
 * 		res[i++] = nums[left++];
        res[i++] = nums[right++];
        
   Once loop ends
   return res array
 * 
 * Time Complexity -> O(n)
 * Space Complexity -> O(n)
 */


public class ShuffleTheArray_1470 {
	@Test
	public void test1() {
		int nums[] = {2,5,1,3,4,7};
		int n = 3;
		Assert.assertTrue(Arrays.equals(toShuffleTheArray(nums,n), new int[] {2,3,5,4,1,7}));
	}

	public int[] toShuffleTheArray(int[] nums, int n) {
        int left=0,right=n,i=0;
        int[] res = new int[2*n];
        while(left<n && right<nums.length){
            res[i++] = nums[left++];
            res[i++] = nums[right++];
        }
        return res;
    }
}
