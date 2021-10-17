package com.hashing.easy;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrings_205 {
	@Test
	public void test1() {
		String s = "egg", t = "add";
		Assert.assertEquals(true, toIsomorphicStrings(s, t));
	}

	@Test
	public void test2() {
		String s = "foo", t = "bar";
		Assert.assertEquals(false, toIsomorphicStrings(s, t));
	}

	@Test
	public void test3() {
		String s = "bbbaaaba", t = "aaabbbba";
		Assert.assertEquals(false, toIsomorphicStrings(s, t));
	}

	private boolean toIsomorphicStrings(String sString, String tString) {
//		HashMap<Character,Integer> map1 = new LinkedHashMap<>();
//		HashMap<Character,Integer> map2 = new LinkedHashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
//		}
//		
//		for (int i = 0; i < t.length(); i++) {
//			map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
//		}
//		
//		for(Map.Entry<Character,Integer> out : map1.entrySet()) {
//			if(!map2.containsValue(out.getValue()) && ) {
//				return false;
//			}
//		}
//		return true;

		char [] s = sString.toCharArray();
        char [] t = tString.toCharArray();
        int [] smap = new int [256];
        int [] tmap = new int [256];
        for (int i = 0; i < s.length; i++) {
            if (smap[s[i]] == 0 && tmap[t[i]] == 0) {
                smap[s[i]] = t[i];
                tmap[t[i]] = s[i];
            } else if (smap[s[i]] != t[i]) return false;
        }
        return true;
	}
}
