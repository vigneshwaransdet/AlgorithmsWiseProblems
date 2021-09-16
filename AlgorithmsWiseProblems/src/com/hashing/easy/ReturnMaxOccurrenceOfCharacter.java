package com.hashing.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public class ReturnMaxOccurrenceOfCharacter {
	@Test
	public void test1() {
		String s = "abca";
		Assert.assertEquals(toReturnMaxOccurrenceOfCharacter(s), 'a');
	}
	
	@Test
	public void test2() {
		String s = "abcabbb";
		Assert.assertEquals(toReturnMaxOccurrenceOfCharacter(s), 'b');
	}
	
	@Test
	public void test3() {
		String s = "";
		Assert.assertEquals(toReturnMaxOccurrenceOfCharacter(s), ' ');
	}


	private char toReturnMaxOccurrenceOfCharacter(String s) {
		int max = 0;
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			max = Math.max(max, map.get(s.charAt(i)));
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))==max) {
				return s.charAt(i);
			}
		}
		
		return ' ';
	}
}
