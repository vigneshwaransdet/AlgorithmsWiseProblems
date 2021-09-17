package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> String
 * Output -> int
 * Constraints -> O(n)
 * Pseudocode:
 * init left=0,right=s.length()-1
 * Iterate the loop until left<=right
 * 		check if(s.charAt(left++)!=s.charAt(right--))
 * 			true return 2
 * return 1
 */

public class RemovePalindromicSubsequences_1332 {
	@Test
	public void test1() {
		String s = "ababa";
		Assert.assertEquals(toRemovePalindromicSubsequences(s), 1);
	}
	
	@Test
	public void test2() {
		String s = "ababb";
		Assert.assertEquals(toRemovePalindromicSubsequences(s), 2);
	}
	@Test
	public void test3() {
		String s = "bbaabaaa";
		Assert.assertEquals(toRemovePalindromicSubsequences(s), 2);
	}
	private int toRemovePalindromicSubsequences(String s) {
//		First Approach:
		// int left=0,right=s.length()-1;
        // while(left<=right){
        //     if(s.charAt(left)==s.charAt(right)){
        //         left++;right--;
        //     }
        //     else {
        //     	return 2;
        //     }
        // }
        // return 1;	
		
//		Second Approach:
		int left=0,right=s.length()-1;
        while(left<=right){
            if(s.charAt(left++)!=s.charAt(right--)) return 2; 
        }
        return 1;
	}
}
