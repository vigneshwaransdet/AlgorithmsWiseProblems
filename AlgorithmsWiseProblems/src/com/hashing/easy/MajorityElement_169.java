package com.hashing.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class MajorityElement_169 {
	@Test
	public void test1() {
		int[] nums = { 3, 2, 3 };
		Assert.assertEquals(3, majorityElement(nums));
	}

	@Test
	public void test2() {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		Assert.assertEquals(2, majorityElement(nums));
	}

//	public int majorityElement(int[] nums) {
//		int n = nums.length;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i : nums) {
//			map.put(i, map.getOrDefault(i, 0) + 1);
//		}
//		int res = 0;
//		for (Map.Entry<Integer, Integer> out : map.entrySet()) {
//			if (out.getValue() > n / 2) {
//				res = out.getKey();
//			}
//		}
//		return res;
//	}
	
	public int majorityElement(int[] nums) {
	int n = nums.length;
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i : nums) {
		map.put(i, map.getOrDefault(i, 0) + 1);
	}
	int res = 0;
	for (int i = 0; i < nums.length; i++) {
		if(map.get(nums[i])>n/2) {
			res=nums[i];
			break;
		}
	}
	return res;
}
	

//	public int majorityElement(int[] nums) {
//		int count = 0;
//		int candidate = 0;
//		for (int num : nums) {
//			if (count == 0) {
//				candidate = num;
//			}
//			if (num == candidate)
//				count += 1;
//			else
//				count -= 1;
//		}
//		return candidate;
//	}
}
