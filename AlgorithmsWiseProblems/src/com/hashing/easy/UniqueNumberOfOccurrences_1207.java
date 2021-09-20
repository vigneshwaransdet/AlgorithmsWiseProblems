package com.hashing.easy;

import java.util.HashMap;
import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOfOccurrences_1207 {
	@Test
	public void test1() {
		int[] arr = {1,2,2,1,1,3};
		Assert.assertTrue(toFindUniqueNumberOfOccurrences(arr));
	}
	
	@Test
	public void test2() {
		int[] arr = {1,2};
		Assert.assertFalse(toFindUniqueNumberOfOccurrences(arr));
	}
	
	@Test
	public void test3() {
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		Assert.assertTrue(toFindUniqueNumberOfOccurrences(arr));
	}
	
	@Test
	public void test4() {
		int[] arr = {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
		Assert.assertFalse(toFindUniqueNumberOfOccurrences(arr));
	}
	private boolean toFindUniqueNumberOfOccurrences(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
//		this is failed for test4() method
//		int index = 0;
//		int preValue = 0;

//		for (Map.Entry<Integer, Integer> out : map.entrySet()) {
//			if(index>0) {
//				if(preValue == out.getValue()) {
//					return false;
//				}
//			}
//			preValue = out.getValue();
//			index++;
//		}
		
		HashSet<Integer> set = new HashSet<>(map.values());
		System.out.println(set);
		if(map.size()==set.size()) return true;
		
		return false;
	}
}
