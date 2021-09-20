package com.twopointers.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArraysII_350 {
	@Test
	public void test1() {
		int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2 };
//		Assert.assertTrue(Arrays.equals(intersect(nums1, nums2), new int[] { 2, 2 }));
		Assert.assertTrue(Arrays.equals(intersectUsingMap(nums1, nums2), new int[] {2,2}));
		
	}
	
	@Test
	public void test2() {
		int[] nums1 = { 4,9,5 }, nums2 = { 9,4,9,8,4 };
//		Assert.assertTrue(Arrays.equals(intersect(nums1, nums2), new int[] {9,4}));
		Assert.assertTrue(Arrays.equals(intersectUsingMap(nums1, nums2), new int[] {9,4}));
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int left = 0, right = 0;
		List<Integer> li = new ArrayList<>();
		while (left < nums1.length && right < nums2.length) {
			if (nums1[left] == nums2[right]) {
				li.add(nums1[left]);
				left++;
				right++;
			}else if(nums1[left]<nums2[right]){
				left++;
			}else {
				right++;
			}
		}
		int[] res = new int[li.size()];
		left = 0;
		for (int out : li) {
			res[left++] = out;
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	
	public int[] intersectUsingMap(int[] nums1, int[] nums2) {
		if(nums1.length>nums2.length) {
			return intersectUsingMap(nums2,nums1);
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
		}
		
		int k=0;
		for (int n : nums2) {
			int cnt = map.getOrDefault(n, 0);
			if(cnt>0) {
				nums1[k++] = n;
				map.put(n, cnt-1);
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums1, 0, k)));
		return Arrays.copyOfRange(nums1, 0, k);
		
	}
}
