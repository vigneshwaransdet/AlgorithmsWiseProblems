package com.hashing.easy;

import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfWordsYouCanType_1935 {
	@Test
	public void test1() {
		String text = "hello world", brokenLetters = "ad";
		Assert.assertEquals(1,toFindMaximumNumberOfWordsYouCanType(text,brokenLetters));
	}
	@Test
	public void test2() {
		String text = "leet code", brokenLetters = "lt";
		Assert.assertEquals(1,toFindMaximumNumberOfWordsYouCanType(text,brokenLetters));
	}
	
	@Test
	public void test3() {
		String text = "leet code", brokenLetters = "e";
		Assert.assertEquals(0,toFindMaximumNumberOfWordsYouCanType(text,brokenLetters));
	}

//	private int toFindMaximumNumberOfWordsYouCanType(String s, String t) {
//		String[] s1 = s.split(" ");
//		HashSet<Character> set = new HashSet<>();
//		for (int i = 0; i < t.length(); i++) {
//			set.add(t.charAt(i));
//		}
//		int count = 0,len=0;
//		for (int i = 0; i < s1.length; i++) {
//			int temp = s1[i].length();
//			len=0;
//			for (int j = 0; j < s1[i].length(); j++) {
//				if(!set.contains(s1[i].charAt(j))) {
//					len++;
//					if(len == temp) {
//						count++;
//					}
//				}
//			}
//		}
//		return count;
//	}
	
	private int toFindMaximumNumberOfWordsYouCanType(String s, String t) {
		int[] ascii = new int[26];
		for (int i = 0; i < t.length(); i++) {
			ascii[t.charAt(i)-97]++;
		}
		String[] s1 = s.split(" ");
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			boolean flag = true;
			String word = s1[i];
			for (int j = 0; j < word.length(); j++) {
				if(ascii[word.charAt(j)-97]==1) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				count++;
			}
		}
		return count;
	}
}
