package com.interview.sathish;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumber {
	@Test
	public void test1() {
		int num = 123;
		Assert.assertEquals(321, toReverseNumber(num));
	}
	
	@Test
	public void test2() {
		int num = -123;
		Assert.assertEquals(-321, toReverseNumber(num));
	}

	@Test
	public void test3() {
		int num = 1534236469;
		Assert.assertEquals(0, toReverseNumber(num));
	}
	
	private int toReverseNumber(int x) {
		long res = 0;
		if(x<0) {
			long sum = -0;
			while(x<0) {
				int rem = x%10;
				sum = (sum*10)+rem;
				x = x/10;
			}
			res = sum;
			
		}else {
			long sum = 0;
			while(x>0) {
				int rem = x%10;
				sum = (sum*10)+rem;
				x = x/10;
			}
			res = sum;
		}
		if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
		return (int)res;
	}
}
