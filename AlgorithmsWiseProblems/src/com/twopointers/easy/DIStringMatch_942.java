package com.twopointers.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> int[]
 * Output -> int[]
 * 
 * Constraints -> O(n)
 * 
 * Pseudocode:
 * First Approach:
 * Declare the int[] array with the size of s.length()+1
 * init pointer = 0,i=0,j=s.length(),index=0
 * Iterate the loop until pointer<s.length()
 * 		check condition s.charAt(pointer)=='I'
 * 			true res[index++] = i++;
 * 		else if s.charAt(pointer)=='D'
 * 			res[index++] = j--;
 * 
 * 	pointer++
 * 
 * once loop ends
 * check if s.charAt(s.length()-1)=='D'
 * 		true res[index] = i;
 * else	res[index] = j;
 * 
 * return res
 * 
 * Optimized Approach:
 * 
 */

public class DIStringMatch_942 {
	@Test
	public void test1() {
		String s = "IDID";
//		Assert.assertTrue(Arrays.equals(toDIStringMatchOneApproach(s), new int[] {0,4,1,3,2}));
		Assert.assertTrue(Arrays.equals(toDIStringMatchOptimizedApproach(s), new int[] { 0, 4, 1, 3, 2 }));
	}

	@Test
	public void test2() {
		String s = "III";
//		Assert.assertTrue(Arrays.equals(toDIStringMatchOneApproach(s), new int[] {0,1,2,3}));
		Assert.assertTrue(Arrays.equals(toDIStringMatchOptimizedApproach(s), new int[] { 0, 1, 2, 3 }));
	}

	@Test
	public void test3() {
		String s = "DDI";
//		Assert.assertTrue(Arrays.equals(toDIStringMatchOneApproach(s), new int[] {3,2,0,1}));
		Assert.assertTrue(Arrays.equals(toDIStringMatchOptimizedApproach(s), new int[] { 3, 2, 0, 1 }));
	}

//	private int[] toDIStringMatchOneApproach(String s) {
//		int[] res = new int[s.length()+1];
//		int pointer = 0,i=0,j=s.length(),index=0;
//		while(pointer<s.length()) {
//			if(s.charAt(pointer)=='I') {
//				res[index++] = i++;
//			}
//			else if(s.charAt(pointer)=='D') {
//				res[index++] = j--;
//			}
//			pointer++;
//		}
//		if(s.charAt(s.length()-1)=='D') {
//			res[index] = i;
//		}
//		else res[index] = j;
//		return res;
//	}

	private int[] toDIStringMatchOptimizedApproach(String s) {
		int[] res = new int[s.length() + 1];
		int pointer = 0, i = 0, j = s.length(), index = 0;
		while (pointer < s.length()) {
			if (s.charAt(pointer) == 'I') {
				res[index++] = i++;
			} else
				res[index++] = j--;
			pointer++;
		}
		if (s.charAt(s.length() - 1) != 'I') {
			res[index] = i;
		} else
			res[index] = j;
		return res;
	}
}
