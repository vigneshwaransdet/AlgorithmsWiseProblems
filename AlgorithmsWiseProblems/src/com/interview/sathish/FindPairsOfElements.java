package com.interview.sathish;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class FindPairsOfElements {
	@Test
	public void test1() {
		int[] nums = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		Assert.assertEquals(3, toFindPairsOfElements(nums));
	}

	private int toFindPairsOfElements(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		int sum = 0;
		for (Entry<Integer,Integer> out : map.entrySet()) {
			sum += out.getValue()/2;
		}
		return sum;
	}
}
