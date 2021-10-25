package com.hashing.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterInAString_387 {
	@Test
	public void test1() {
		String s = "leetcode";
		Assert.assertEquals(0, firstUniqChar(s));
	}

	@Test
	public void test2() {
		String s = "loveleetcode";
		Assert.assertEquals(2, firstUniqChar(s));
	}

	@Test
	public void test3() {
		String s = "aabb";
		Assert.assertEquals(-1, firstUniqChar(s));
	}

	@Test
	public void test4() {
		String s = "dddccdbba";
		Assert.assertEquals(8, firstUniqChar(s));
	}

//	private int firstUniqChar(String s) {
//		HashMap<Character, Integer> map = new LinkedHashMap<>();
//		for (char ch : s.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//		
//		for (int i = 0; i < s.length(); i++) {
//			if(map.get(s.charAt(i))==1) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	private int firstUniqChar(String s) {
	int[] ascii = new int[26];
	for (char ch : s.toCharArray()) {
		ascii[ch - 97]++;
	}

	for (int i = 0; i < s.length(); i++) {
		if (ascii[s.charAt(i) - 97] == 1) {
			return i;
		}
	}

	return -1;
}
	
//	private int firstUniqChar(String s) {
//		HashMap<Character, Integer> map = new LinkedHashMap<>();
//		for (char ch : s.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//		
//		for (Character each : map.keySet()) {
//			if(map.get(each).equals(1)) {
//				return s.indexOf(each);
//			}
//		}
//		
//		return -1;
//	}
	
}
