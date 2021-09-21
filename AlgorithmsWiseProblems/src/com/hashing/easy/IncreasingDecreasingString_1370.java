package com.hashing.easy;

import org.junit.Test;

public class IncreasingDecreasingString_1370 {
	@Test
	public void test1() {
		String s = "aaaabbbbcccc";
		System.out.println(toFindIncreasingDecreasingString(s));
	}

	private String toFindIncreasingDecreasingString(String s) {
		StringBuilder sb = new StringBuilder();
		int[] ascii = new int[26];
		int len = s.length();
		for (int ch : s.toCharArray()) {
			ascii[ch-97]++;
		}
		
		while(len>0) {
			for (int i = 0; i < 26; i++) {
				if(ascii[i]>0) {
					sb.append((char)(97+i));
					ascii[i]--;
					len--;
				}
			}
			for (int i = 25; i >=0 ; i--) {
				if(ascii[i]>0) {
					sb.append((char)(97+i));
					ascii[i]--;
					len--;
				}
			}
		}
		System.out.println(sb);
		return sb.toString();
	}

}
