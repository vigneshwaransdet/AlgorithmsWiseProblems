package com.hashing.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class MakeTwoArraysEqualByReversingSubArrays_1460 {
	@Test
	public void test1() {
		int[] target = { 1, 2, 3, 4 }, arr = { 2, 4, 1, 3 };
		Assert.assertTrue(toMakeTwoArraysEqualByReversingSubArrays(target, arr));
	}

	@Test
	public void test2() {
		int[] target = { 1, 2, 2, 3 }, arr = { 1, 1, 2, 3 };
		Assert.assertFalse(toMakeTwoArraysEqualByReversingSubArrays(target, arr));
	}

//	private boolean toMakeTwoArraysEqualByReversingSubArrays(int[] target, int[] arr) {
//		HashMap<Integer, Integer> tmap = new HashMap<>();
//		HashMap<Integer, Integer> smap = new HashMap<>();
//		for (int i = 0; i < target.length; i++) {
//			tmap.put(target[i], tmap.getOrDefault(target[i], 0) + 1);
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			smap.put(arr[i], smap.getOrDefault(arr[i], 0) + 1);
//		}
//		return smap.equals(tmap) ? true : false;
//	}
	
	private boolean toMakeTwoArraysEqualByReversingSubArrays(int[] target, int[] arr) {
		Arrays.sort(target);
        Arrays.sort(arr);
		return Arrays.equals(target, arr) ? true : false;
		
	}

}
