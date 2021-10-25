package com.interview.sathish;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumber_202 {
	@Test
	public void test1() {
		int n = 19;
		Assert.assertEquals(1, toFindHappyNumber(n));
	}

	private boolean toFindHappyNumber(int n) {
		int sum = 0;
		if(n==1 || n==7) return true;
		while(n>9) {
			sum=0;
			while(n>0) {
				sum = sum+(n%10)*(n%10);
				n=n/10;
			}
			if(sum==7 || sum==1) return true;
			n=sum;
		}
		return sum==1;
	}
}
