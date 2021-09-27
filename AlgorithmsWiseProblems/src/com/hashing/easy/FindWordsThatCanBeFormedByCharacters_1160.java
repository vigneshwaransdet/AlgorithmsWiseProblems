package com.hashing.easy;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;


public class FindWordsThatCanBeFormedByCharacters_1160 {
	@Test
	public void test1() {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		Assert.assertEquals(6, countCharacters(words,chars));
	}
	
	@Test
	public void test2() {
		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		Assert.assertEquals(10, countCharacters(words,chars));
	}
	
	@Test
	public void test3() {
		String[] words = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
		String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
		Assert.assertEquals(0, countCharacters(words,chars));
	}

	private int countCharacters(String[] words, String chars) {
//		int len=0,count=0,res=0;
//		HashMap<Character,Integer> map = new HashMap<>();
//		for (char ch : chars.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1); 
//		
//		for (int i = 0; i < words.length; i++) {
//			len = words[i].length();
//			count=0;
//			String word = words[i];
//			
//			for (int j = 0; j < word.length(); j++) {
//				if(map.containsKey(word.charAt(j)) && (map.get(word.charAt(j))==1 || map.get(word.charAt(j))>1)) {
//					count++;
//				}
//				else break;
//				if(len==count) res+=count;
//			}
//		}	
//		System.out.println(res);
//		return res;
		
		int result = 0;
		int[] ascii = new int[26];
		for (char ch : chars.toCharArray()) ascii[ch-97]++;
		for (String word : words) {
			boolean good = true;
			int[] temp = ascii.clone();
			for (char ch : word.toCharArray()) {
				if(--temp[ch-97]<0) {
					good = false;
					break;
				}
			}
			if(good == true) result += word.length();
		}
		return result;
	}
}
