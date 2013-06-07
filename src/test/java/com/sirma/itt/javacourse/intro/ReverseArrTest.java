package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Tests the class that reverses a given array.
 * 
 * @author Vasko
 */
public class ReverseArrTest {

	/**
	 * Tests the method that reverses a given array, it gives an array to be
	 * reversed, and after that compares the result with the right answer.
	 */
	@Test
	public void testReverse() {
		ReverseArr tester = new ReverseArr();
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int reversedArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		tester.reverse(array);
		for (int i = 0; i < array.length; i++) {
			Assert.assertEquals(array[i], reversedArray[i]);
		}
	}
}
