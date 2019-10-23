package com.loops;

import org.junit.Test;

/**
 * Condition will not executed on the first iteration of loop
 * Condition will be executed for each element of the loop
 * 
 * @author jth9rmd
 *
 */
public class DoWhileLoop {

	@Test
	public void arrayInt() {

		int[] intArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int i = 0;
		do {
			System.out.println(intArray[i]);
			i++;

		} while (intArray.length > i);

	}
}
