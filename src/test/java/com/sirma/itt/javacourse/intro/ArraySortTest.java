package com.sirma.itt.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the quickSort class.
 * 
 * @author Vasko
 */
public class ArraySortTest {
	/**
	 * Passes an array to be sorted, and then compares it to the real sorted
	 * array.
	 */
	@Test
	public void testDisplay() {

		ArraySort tester = new ArraySort();
		int[] array = { 1, 2, 3, 4, 23, 5, 6, 7, 8, 9, 8, 7, 6, 5, 22 };
		int[] sortedArray = { 1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 22, 23 };
		tester.sort(array);

		Assert.assertArrayEquals(array, sortedArray);
	}
}
