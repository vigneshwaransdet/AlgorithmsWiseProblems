package com.interview.sathish;

import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumber {
	@Test
	public void test1() {
		int n = 153;
		Assert.assertTrue(toFindArmstrongNumber(n));
	}
	
	@Test
	public void test2() {
		int n = 152;
		Assert.assertFalse(toFindArmstrongNumber(n));
	}

	private boolean toFindArmstrongNumber(int n) {
		int temp = n,sum=0;
		while(temp!= 0) {
			int rem = temp%10;
			sum = sum + (rem*rem*rem);
			temp = temp/10;
		}
		return sum==n ? true : false;
	}
}
