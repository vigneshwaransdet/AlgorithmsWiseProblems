package com.hashing.easy;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigitInAString_1796 {
	@Test
	public void test1() {
		String s = "dfa12321afd";
		Assert.assertEquals(2, toFindSecondLargestDigitInAString(s));
	}
	
	@Test
	public void test2() {
		String s = "abc1111";
		Assert.assertEquals(-1, toFindSecondLargestDigitInAString(s));
	}
	
	@Test
	public void test3() {
		String s = "abc";
		Assert.assertEquals(-1, toFindSecondLargestDigitInAString(s));
	}
	
	@Test
	public void test4() {
		String s = "ck077";
		Assert.assertEquals(0, toFindSecondLargestDigitInAString(s));
	}

//	private int toFindSecondLargestDigitInAString(String s) {
//		int fMax=-1,sMax=-1;
//		String replaced = s.replaceAll("[a-z]", "");
//		if(replaced.isEmpty()) return sMax;
//		ArrayList<Integer> list = new ArrayList<>();
//		char[] c = replaced.toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			list.add(c[i]-'0');
//		}
//		for (int out : list) {
//			if(out>fMax) {
//				sMax=fMax;
//				fMax=out;
//			}
//			else if(out>sMax && out!=fMax) {
//				sMax=out;
//			}
//		}
//		return sMax;
//	}
	
	private int toFindSecondLargestDigitInAString(String s) {
		int fMax=-1,sMax=-1;
		for (char c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				int out = Character.digit(c, 10);
				System.out.print(out+" ");
				if(out>fMax) {
					sMax=fMax;
					fMax=out;
				}
				else if(out>sMax && out!=fMax) {
					sMax=out;
				}
			}
		}
		return sMax;
	}
}
