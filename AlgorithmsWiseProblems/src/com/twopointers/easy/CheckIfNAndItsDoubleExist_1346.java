package com.twopointers.easy;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> int[]
 * Output -> boolean
 * Constaints -> O(n)
 * 
 * Pseudocode:
 * reverse the array
 * Iterate the outer loop until i<arr.length
 * Iterate the inner loop until j<arr.length
 * 		check i!=j && arr[i] == 2*arr[j] 
 * 			true, return true
 * 
 * return false
 * 
 */

public class CheckIfNAndItsDoubleExist_1346 {
	@Test
	public void test1() {
		int[] nums = {10,2,5,3};
		Assert.assertEquals(toCheckIfNAndItsDoubleExist(nums), true);
	}
	
	@Test
	public void test2() {
		int[] nums = {7,1,14,11};
		Assert.assertEquals(toCheckIfNAndItsDoubleExist(nums), true);
	}
	
	@Test
	public void test3() {
		int[] nums = {3,1,7,11};
		Assert.assertEquals(toCheckIfNAndItsDoubleExist(nums), false);
	}
	
	@Test
	public void test4() {
		int[] nums = {-20,8,-6,-14,0,-19,14,4};
		Assert.assertEquals(toCheckIfNAndItsDoubleExist(nums), true);
	}
	
	@Test
	public void test5() {
		int[] nums = {-2,0,10,-19,4,6,-8};
		Assert.assertEquals(toCheckIfNAndItsDoubleExist(nums), false);
	}

	private boolean toCheckIfNAndItsDoubleExist(int[] arr1) {
		int[] arr = Arrays.stream(arr1).boxed()
			    .sorted(Collections.reverseOrder())
			    .mapToInt(Integer::intValue)
			    .toArray();
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length;j++) {
				if(i!=j && arr[i] == 2*arr[j]) return true;
			}
		}
		
		// Another Approach
//		for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){
//                    return true;
//                }
//            }
//        }
        return false;
	}
}
