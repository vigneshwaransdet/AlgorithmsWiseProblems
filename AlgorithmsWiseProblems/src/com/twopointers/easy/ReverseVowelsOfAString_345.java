package com.twopointers.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsOfAString_345 {
	@Test
	public void test1() {
		String s = "hello";
		Assert.assertEquals(toReverseVowelsOfAString(s), "holle");
	}
	
	@Test
	public void test2() {
		String s = "leetcode";
		Assert.assertEquals( "leotcede",toReverseVowelsOfAString(s));
	}

//	private String toReverseVowelsOfAString(String s) {
//		int left = 0, right = s.length() - 1;
//		String vowels = "aeiouAEIOU";
//		char[] charArray = s.toCharArray();
//		while (left < right) {
//			if ((!vowels.contains(String.valueOf(charArray[left])))
//					&& (vowels.contains(String.valueOf(charArray[right])))) {
//				left++;
//			} else if((vowels.contains(String.valueOf(charArray[left])))
//					&& (vowels.contains(String.valueOf(charArray[right])))){
//				char temp = charArray[left];
//				charArray[left++] = charArray[right];
//				charArray[right--] = temp;
//			}
//			else if((vowels.contains(String.valueOf(charArray[left])))
//					&& (!vowels.contains(String.valueOf(charArray[right])))){
//				right--;
//			}else {
//				left++;right--;
//			}
//		}
//		System.out.println(Arrays.toString(charArray));
//		String res = "";
//		for (char c : charArray) {
//			res+=c;
//		}
//		return res;
//	}
	
	private String toReverseVowelsOfAString(String s) {
		int left = 0, right = s.length()-1;
		String vowels = "aeiouAEIOU";
		while(left < right) {
			if(!vowels.contains(String.valueOf(s.charAt(left))) && vowels.contains(String.valueOf(s.charAt(right))) {
				
			}
		}
	}
	
}
