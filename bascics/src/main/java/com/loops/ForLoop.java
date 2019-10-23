package com.loops;

import org.junit.Test;

/**
 * Index variable initialization, condition check, increment all is done in single line
 * on first iteration - initialization, condition check will be done
 * from second iteration - increment, condition check will be done
 * 
 * @author jth9rmd
 *
 */
public class ForLoop {

	@Test
	public void loopArray() {

		int[] loopArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; loopArray.length > i; i++) {
			System.out.println(loopArray[i]);
		}

	}

}
