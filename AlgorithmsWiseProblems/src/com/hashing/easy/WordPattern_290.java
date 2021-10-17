package com.hashing.easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordPattern_290 {
	@Test
	public void test1() {
		String pattern = "abba", s = "dog cat cat dog";
		Assert.assertEquals(true, toWordPattern(pattern, s));
	}

	private boolean toWordPattern(String pattern, String s) {
		String[] s1 = s.split(" ");
		int j = 0;
		Map<Character, String> map = new HashMap<>();
		if (pattern.length() != s1.length)
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			for (Map.Entry<Character, String> map1 : map.entrySet()) {
				if (map1.getValue().equals(s1[j]) && !(map.containsKey(pattern.charAt(i)))) {
					return false;
				}
			}
			if (map.containsKey(pattern.charAt(i)) && !(s1[j].equals(map.get(pattern.charAt(i))))) {
				return false;
			} else
				map.put(pattern.charAt(i), s1[j]);
			j++;
		}
		return true;
	}

}
