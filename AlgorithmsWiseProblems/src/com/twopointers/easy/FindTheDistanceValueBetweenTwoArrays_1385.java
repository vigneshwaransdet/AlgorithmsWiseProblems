package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDistanceValueBetweenTwoArrays_1385 {
	@Test
	public void test1() {
		int[] arr1 = {4,5,8}, arr2 = {10,9,1,8}; 
		int d = 2;
		Assert.assertEquals(toFindTheDistanceValueBetweenTwoArrays(arr1,arr2,d), 2);
	}
	
	@Test
	public void test2() {
		int[] arr1 = {1,4,2,3}, arr2 = {-4,-3,6,10,20,30}; 
		int d = 3;
		Assert.assertEquals(toFindTheDistanceValueBetweenTwoArrays(arr1,arr2,d), 2);
	}
	
	@Test
	public void test3() {
		int[] arr1 = {2,1,100,3}, arr2 = {-5,-2,10,-3,7}; 
		int d = 6;
		Assert.assertEquals(toFindTheDistanceValueBetweenTwoArrays(arr1,arr2,d), 1);
	}

	private int toFindTheDistanceValueBetweenTwoArrays(int[] arr1, int[] arr2, int d) {
		int count=0,resultCount=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				int diff = Math.abs(arr1[i]-arr2[j]);
				if(diff > d && j==arr2.length-1) {
					count++;
				}
				else if(diff<=d){
					break;
				}
			}
		}
		return count;
	}
}
