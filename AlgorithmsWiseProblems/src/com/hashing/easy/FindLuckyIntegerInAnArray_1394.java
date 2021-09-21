package com.hashing.easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class FindLuckyIntegerInAnArray_1394 {
	@Test
	public void test1() {
		int[] arr = {2,2,3,4};
		Assert.assertEquals(toFindLuckyIntegerInAnArray(arr), 2);
	}
	
	@Test
	public void test2() {
		int[] arr = {1,2,2,3,3,3};
		Assert.assertEquals(toFindLuckyIntegerInAnArray(arr), 3);
	}
	
	@Test
	public void test3() {
		int[] arr = {2,2,2,3,3};
		Assert.assertEquals(toFindLuckyIntegerInAnArray(arr), -1);
	}

	private int toFindLuckyIntegerInAnArray(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int max = 0;
		for (Map.Entry<Integer,Integer> out : map.entrySet()) {
			if(out.getKey()==out.getValue()) {
				max = Math.max(max, out.getKey());
			}
		}
		return max>0 ? max:-1;
	}

}
