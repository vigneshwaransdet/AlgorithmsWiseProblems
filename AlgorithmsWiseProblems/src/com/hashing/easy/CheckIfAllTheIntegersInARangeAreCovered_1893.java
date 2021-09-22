package com.hashing.easy;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAllTheIntegersInARangeAreCovered_1893 {
	@Test
	public void test1() {
		int[][] ranges = {{1,2},{3,4},{5,6}};
		int left = 2, right = 5;
		Assert.assertTrue(toCheckIfAllTheIntegersInARangeAreCovered(ranges,left,right));
	}

	private boolean toCheckIfAllTheIntegersInARangeAreCovered(int[][] ranges, int left, int right) {
		int[] out = new int[51];
		for (int i = 0; i < ranges.length; i++) {
			int start = ranges[i][0];
			int end = ranges[i][1];
			for (int j = start; j <= end; j++) {
				++out[j];
			}
		}
		
		for (int i = left; i <= right; i++) {
			if(out[i]==0) return false;
		}
		
		return true;
	}
}
