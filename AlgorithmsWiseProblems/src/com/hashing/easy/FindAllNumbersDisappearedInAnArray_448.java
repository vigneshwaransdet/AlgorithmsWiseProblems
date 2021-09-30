package com.hashing.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FindAllNumbersDisappearedInAnArray_448 {
	@Test
	public void test1() {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> list = Arrays.asList(5,6);
		Assert.assertEquals(list, findDisappearedNumbers(nums));
	}
	
	@Test
	public void test2() {
		int[] nums = { 1,1 };
		List<Integer> list = Arrays.asList(2);
		Assert.assertEquals(list, findDisappearedNumbers(nums));
	}

//	public List<Integer> findDisappearedNumbers(int[] nums) {
//		HashSet<Integer> set = new HashSet<>();
//		for (int i = 0; i < nums.length; i++) {
//			set.add(nums[i]);
//		}
//		
//		List<Integer> list = new ArrayList<>();
//		for (int i=1;i<=nums.length;i++) {
//			if(!set.contains(i)) {
//				list.add(i);
//			}
//		}
//		System.out.println(list);
//		return list;
//	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[nums.length+1];
		for (int i = 1; i <= nums.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]] = 0;
		}
		
		for (int i = 0; i <= nums.length; i++) {
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
		}
		return list;
	}
}
