package com.hashing.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class RedistributeCharactersToMakeAllStringsEqual_1897 {
	@Test
	public void test1() {
		String[] words = { "abc", "aabc", "bc" };
		Assert.assertTrue(toRedistributeCharactersToMakeAllStringsEqual(words));
	}

//	private boolean toRedistributeCharactersToMakeAllStringsEqual(String[] words) {
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (String word : words) {
//			for (char c : word.toCharArray()) {
//				map.put(c, map.getOrDefault(c, 0) + 1);
//			}
//		}
//		for (Map.Entry<Character, Integer> out : map.entrySet()) {
//			if (out.getValue() % words.length != 0)
//				return false;
//		}
//		return true;
//	}
	
	private boolean toRedistributeCharactersToMakeAllStringsEqual(String[] words) {
		int[] ascii = new int[26];
		for (String word : words) {
			for (char c : word.toCharArray()) {
				ascii[c-97]++;
			}
		}
		int n = words.length;
		for (int i = 0; i < 26; i++) {
			if(ascii[i]%n !=0) return false;
		}
		return true;
	}
}
