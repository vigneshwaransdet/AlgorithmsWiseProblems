package com.hashing.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfBalloons_1189 {
	@Test
	public void test1() {
		String text = "nlaebolko";
		Assert.assertEquals(1, toFindMaximumNumberOfBalloons(text));
	}

	@Test
	public void test2() {
		String text = "loonbalxballpoon";
		Assert.assertEquals(2, toFindMaximumNumberOfBalloons(text));
	}

	@Test
	public void test3() {
		String text = "balllllllllllloooooooooon";
		Assert.assertEquals(1, toFindMaximumNumberOfBalloons(text));
	}
//	"krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"

//	private int toFindMaximumNumberOfBalloons(String text) {
//		HashMap<Character,Integer> p_map = new HashMap<>();
//		String pattern = "balloon";
//		for (int i = 0; i < pattern.length(); i++) {
//			p_map.put(pattern.charAt(i), p_map.getOrDefault(pattern.charAt(i),0)+1);
//		}
//		int count = 0;
//		HashMap<Character,Integer> map = new HashMap<>();
//		for (int i = 0; i < text.length(); i++) {
//			if(p_map.containsKey(text.charAt(i))) {
//				map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
//				if(map.get(text.charAt(i))>2) {
//					map.put(text.charAt(i), map.get(text.charAt(i))-1);
//				}
//				if(p_map.equals(map)) {
//					count++;
//					map.clear();
//				}
//			}
//		}
//		System.out.println(count);
//		return count;
//	}

	private int toFindMaximumNumberOfBalloons(String text) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
		}
		int bcnt = map.getOrDefault('b', 0);
		int acnt = map.getOrDefault('a', 0);
		int lcnt = map.getOrDefault('l', 0);
		if (lcnt < 2) return 0;
		int ocnt = map.getOrDefault('o', 0);
		if (ocnt < 2) return 0;
		int ncnt = map.getOrDefault('n', 0);
		List<Integer> list = new ArrayList<>();
		list.add(bcnt);
		list.add(acnt);
		list.add(lcnt/2);
		list.add(ocnt/2);
		list.add(ncnt);
		int count = Collections.min(list);
		return count;
	}
}
