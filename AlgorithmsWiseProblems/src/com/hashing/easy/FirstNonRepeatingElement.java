package com.hashing.easy;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatingElement {
	@Test
	public void test1() {
		int[] nums = {-1,2,-1,3,2};
		Assert.assertEquals(3, toFirstNonRepeatingElement(nums));
	}

	private int toFirstNonRepeatingElement(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		int res = 0,unique=1;
		for (int i = 0; i < nums.length; i++) {
			if(map.get(nums[i])==unique) {
				res= nums[i];
				break;
			}
		}
		return res;
	}

}
