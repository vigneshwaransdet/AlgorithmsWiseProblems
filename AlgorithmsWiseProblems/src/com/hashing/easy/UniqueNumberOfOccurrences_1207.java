package com.hashing.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOfOccurrences_1207 {
	@Test
	public void test1() {
		int[] arr = {1,2,2,1,1,3};
		Assert.assertTrue(toFindUniqueNumberOfOccurrences(arr));
	}

	private boolean toFindUniqueNumberOfOccurrences(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> out : map.entrySet()) {
			int index=1;
			if(out.getValue()==map.get(arr[index++])) {
				return false;
			}
		}
		return true;
	}
}
