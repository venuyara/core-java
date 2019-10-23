package com.loops;

import org.junit.Test;

/**
 * Condition will be checked on start of the loop
 * Condition will be checked for every element of the loop
 * 
 * @author jth9rmd
 *
 */
public class WhileLoop {

	@Test
	public void loopAndArray() {
		int[] intArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int i = 0;

		while (intArray.length > i) {
			System.out.println(intArray[i]);
			i++;
		}
	}

}
