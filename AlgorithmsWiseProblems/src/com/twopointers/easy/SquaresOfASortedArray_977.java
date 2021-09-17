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
 * Declare new int[] array for store the result
 * init left=0,right=nums.length-1,i=nums.length-1
 * Iterate the loop until left<=right
 * 		check if nums[right]*nums[right] > nums[left]*nums[left]
 * 			res[i--] = nums[right]*nums[right];
			right--;
		else if nums[right]*nums[right] < nums[left]*nums[left]
			res[i--] = nums[left]*nums[left];
			left++;
		else if nums[right]*nums[right] == nums[left]*nums[left] && left!=right
			res[i--] = nums[left]*nums[left];
			res[i--] = nums[right]*nums[right];
			left++;right--;
		else 
			res[i--] = nums[left]*nums[left];
			left++;right--;
			
 * 	return res
 * 
 */

public class SquaresOfASortedArray_977 {
	@Test
	public void test1() {
		int[] nums = {-4,-1,0,3,10};
		Assert.assertTrue(Arrays.equals(toSquaresOfASortedArray(nums), new int[] {0,1,9,16,100}));
	}
	
	@Test
	public void test2() {
		int[] nums = {-7,-3,2,3,11};
		Assert.assertTrue(Arrays.equals(toSquaresOfASortedArray(nums), new int[] {4,9,9,49,121}));
	}

	private int[] toSquaresOfASortedArray(int[] nums) {
		int[] res = new int[nums.length];
		int left=0,right=nums.length-1,i=nums.length-1;
		while(left<=right) {
			if(nums[right]*nums[right] > nums[left]*nums[left]) {
				res[i--] = nums[right]*nums[right];
				right--;
			}
			else if(nums[right]*nums[right] < nums[left]*nums[left]) {
				res[i--] = nums[left]*nums[left];
				left++;
			}
			else if(nums[right]*nums[right] == nums[left]*nums[left] && left!=right){
				res[i--] = nums[left]*nums[left];
				res[i--] = nums[right]*nums[right];
				left++;right--;
			}
			else {
				res[i--] = nums[left]*nums[left];
				left++;right--;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
}
