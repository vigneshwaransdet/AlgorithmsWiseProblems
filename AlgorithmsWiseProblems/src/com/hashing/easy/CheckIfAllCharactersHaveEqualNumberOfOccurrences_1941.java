package com.hashing.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences_1941 {
	@Test
	public void test1() {
		String s = "abacbc";
		Assert.assertTrue(toCheckIfAllCharactersHaveEqualNumberOfOccurrences(s));
	}
	
	@Test
	public void test2() {
		String s = "aaabb";
		Assert.assertFalse(toCheckIfAllCharactersHaveEqualNumberOfOccurrences(s));
	}

//	private boolean toCheckIfAllCharactersHaveEqualNumberOfOccurrences(String s) {
//		HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        
//        HashSet<Integer> set = new HashSet<>();
//        for(Map.Entry<Character,Integer> out : map.entrySet()){
//            if(!set.contains(out.getValue())){
//                set.add(out.getValue());
//            }
//            if(set.size()>1) return false;
//        }
//        return true;
//	}
	
	private boolean toCheckIfAllCharactersHaveEqualNumberOfOccurrences(String s) {
		int[] ascii = new int[26];
		for (int i = 0; i < s.length(); i++) {
			ascii[s.charAt(i)-97]++;
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < ascii.length; i++) {
			if(!set.contains(ascii[i]) && ascii[i]!=0) {
				set.add(ascii[i]);
			}
			if(set.size()>1) return false;
		}
		return true;
	}
}
