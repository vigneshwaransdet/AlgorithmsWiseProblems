package com.hashing.easy;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class RankTransformOfAnArray_1331 {
	@Test
	public void test1() {
		int[] arr = {40,10,20,30};
		Assert.assertTrue(Arrays.equals(toRankTransformOfAnArray(arr), new int[] {4,1,2,3}));
	}
	
	@Test
	public void test2() {
		int[] arr = {100,100,100};
		Assert.assertTrue(Arrays.equals(toRankTransformOfAnArray(arr), new int[] {1,1,1}));
	}
	
	@Test
	public void test3() {
		int[] arr = {37,12,28,9,100,56,80,5,12};
		Assert.assertTrue(Arrays.equals(toRankTransformOfAnArray(arr), new int[] {5,3,4,2,8,6,7,1,3}));
	}

	private int[] toRankTransformOfAnArray(int[] arr) {
		int n = arr.length;
		int[] sorted = Arrays.copyOf(arr, n);
		Arrays.sort(sorted);
		HashMap<Integer,Integer> map = new HashMap<>();
		int idx = 0;
		for (int num : sorted) {
			if(!map.containsKey(num)) {
				map.put(num, idx+1);
				idx++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = map.get(arr[i]);
		}
		
		return arr;
	}

}
