package com.hashing.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
	@Test
	public void test1() {
		int[] nums = {8,1,2,2,3};
		Assert.assertTrue(Arrays.equals(toFindHowManyNumbersAreSmallerThanTheCurrentNumber(nums), new int[] {4,0,1,1,3}));
	}

	private int[] toFindHowManyNumbersAreSmallerThanTheCurrentNumber(int[] nums) {
		int[] res = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                if(j==nums.length-1){
                    res[i] = count;
                    count=0;
                }
            }
        }
        return res;
	}
}
