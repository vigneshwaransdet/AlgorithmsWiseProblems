package com.hashing.easy;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagram_242 {
	@Test
	public void test1() {
		String s = "anagram", t = "nagaram";
//		Assert.assertTrue(toFindValidAnagram(s,t));
		Assert.assertTrue(toFindValidAnagramUsingAscii(s,t));
	}

	//Using Map:
	private boolean toFindValidAnagram(String s, String t) {
		HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        
        return smap.equals(tmap) ? true : false;
	}
	
	//Using Ascii:
	private boolean toFindValidAnagramUsingAscii(String s, String t) {
		int[] sascii = new int[26];
		for (int i = 0; i < s.length(); i++) {
			sascii[s.charAt(i)-97]++;
		}
		
		int[] tascii = new int[26];
		for (int i = 0; i < t.length(); i++) {
			tascii[t.charAt(i)-97]++;
		}
		return Arrays.equals(sascii, tascii) ? true:false;
	}
}
