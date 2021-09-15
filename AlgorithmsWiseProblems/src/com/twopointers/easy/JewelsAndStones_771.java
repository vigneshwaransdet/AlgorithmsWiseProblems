package com.twopointers.easy;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> String, String
 * Output -> int
 * Constraints -> O(n)
 * 
 * Pseudocode:
 * initialize j = 0, count = 0
 * Declare the set to store the jewels 
 * Iterate the loop until jewels length
 * 		add the jewels into set
 * 
 * Iterate the while loop until j<stones.length()
 * 	check set.contains(stones.charAt(j++))
 * 		if true increment the count
 * once loop ends 
 * return count
 */

public class JewelsAndStones_771 {
	@Test
	public void test1() {
		String jewels = "aA", stones = "aAAbbbb";
		Assert.assertEquals(numJewelsInStones(jewels,stones), 3);
	}

	public int numJewelsInStones(String jewels, String stones) {
		int j = 0, count = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < jewels.length(); i++) {
			set.add(jewels.charAt(i));
		}
		while (j < stones.length()) {
			if (set.contains(stones.charAt(j++))) {
				count++;
			}
		}
		return count;
	}
}
