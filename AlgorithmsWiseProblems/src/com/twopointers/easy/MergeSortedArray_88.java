package com.twopointers.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/*
 *	Input -> two int[] arrays, two integers
 *	Output -> one int[] array  
 * 	Constraints: Two Pointers
 * 	Pseudocode:
 * 	Iterate the loop until m>0 and n>0
 * 	check 	if(nums1[m-1] < nums2[n-1]){
                nums1[m+n-1] = nums2[n-1];
                decrement the n
            }
            else{
            	nums1[m+n-1] = nums1[m-1];
            	decrement the m
            }
 * Iterate the loop until n>0
 * 
 *  
 */

public class MergeSortedArray_88 {
	@Test
	public void test1() {
		int[] nums1 = {2,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {1,5,6};
		int n = 3;
		Assert.assertTrue(Arrays.equals(toFindMergeSortedArray(nums1, m, nums2, n), new int[] {1,2,2,3,5,6}));
	}
	
	@Test
	public void test2() {
		int[] nums1 = {0};
		int m = 0;
		int[] nums2 = {1};
		int n = 1;
		Assert.assertTrue(Arrays.equals(toFindMergeSortedArray(nums1, m, nums2, n), new int[] {1}));
	}
	
	public int[] toFindMergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        while(m>0 && n>0){
            if(nums1[m-1] < nums2[n-1]){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
            else{
            	nums1[m+n-1] = nums1[m-1];
            	m--;
            }
        }
        while(n>0) {
        	nums1[m+n-1] = nums2[n-1];
        	n--;
        }
        System.out.println(Arrays.toString(nums1));
        return nums1;
    }
}
