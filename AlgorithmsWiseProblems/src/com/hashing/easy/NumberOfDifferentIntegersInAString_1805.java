package com.hashing.easy;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDifferentIntegersInAString_1805 {
	@Test
	public void test1() {
		String word = "a123bc34d8ef36";
		Assert.assertEquals(toFindNumberOfDifferentIntegersInAString(word), 4);
	}
	
	@Test
	public void test2() {
		String word = "a123bc034d8ef0034";
		Assert.assertEquals(toFindNumberOfDifferentIntegersInAString(word), 3);
	}

	private int toFindNumberOfDifferentIntegersInAString(String word) {
//		List<String> li1 = new ArrayList<>();
//		for (int i = 0; i < word.length();i++) {
//			String temp = "";
//			List<Integer> li2 = new ArrayList<>();
//			for (int j = i; j < word.length(); j++) {
//				if(Character.isDigit(word.charAt(j))) {
//					if(word.charAt(j)-'0'==0) {
//					temp = temp+""+word.charAt(j);
					
//					li2.add(Character.getNumericValue(word.charAt(j)));
					
//					if(j==word.length()-1) {
//						i=j;
//						if(!li1.contains(temp)) {
//							li1.add(temp);
//						}
//					}
//				}
//				else if((Character.isLetter(word.charAt(j))) && (j>0 && Character.isDigit(word.charAt(j-1)))) {
//					if(!li1.contains(temp)) {
//						li1.add(temp);
//						i=j;
//						break;
//					}
//				}
//			}
//		}
//		return li1.size();
		String replaced = word.replaceAll("[a-z]", " "); // replace all a-z characters
		Set<String> nums = new HashSet();
		String[] words = replaced.split(" "); // split based on space character
		for (String s : words) {
			if (s.trim().length() > 0) // if word is not empty add to the set
				nums.add(s.replaceAll("^0*", "")); // replace all leading zeros - ^matchs the beginning zeros * as many
													// as zeros will be matched
		}
		System.out.println(nums);
		return nums.size();
		
	}

}
