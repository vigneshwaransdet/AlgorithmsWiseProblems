package com.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Input -> int
 * Output -> int
 * Contraints -> O(n)
 * 
 * Pseudocode:
 * initialize productsN = n, sumN = n,products = 1,sum =0
 * Iterate the while loop until sumN>0
 * 		convert sumN into digits
 * 		add the digits and store it in sum
 * 
 * Iterate the while loop until sumN>0
 * 		convert productN into digits
 * 		product the digits and store it in products
 * 
 * Declare the result variable
 * find the difference between the products and the sum and store it in a result
 * return the result
 * 
 * Time Complexity -> O(n) + o(m)
 * Space Complexity -> O(1)
 */

public class SubtractTheProductAndSumOfDigitsOfAnInteger_1281 {
	@Test
	public void test1() {
		int n = 234;
		Assert.assertEquals(subtractProductAndSum(n), 15);
	}
	
	public int subtractProductAndSum(int n) {
        int productsN = n, sumN = n; 
        int products = 1,sum =0;
        while(sumN>0){
            int rem = sumN%10;
            sum+=rem;
            sumN=sumN/10;
        }
        while(productsN>0){
            int rem = productsN%10;
            products*=rem;
            productsN=productsN/10;
        }
        int result = products - sum;
        return result;
    }
}
