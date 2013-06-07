package com.sirma.itt.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the Array class.
 * 
 * @author Vasko
 */
public class ArrayTest {
	/**
	 * Tests the method, that gets the minimal element of the array.
	 */
	@Test
	public void testGetMinElement() {
		int minEl = 0;
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		minEl = tester.getMinElement(array);
		Assert.assertEquals(1, minEl);
	}

	/**
	 * Tests the method that sums the elements of the array.
	 */
	@Test
	public void testGetSum() {
		int sumArr = 0;
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, };
		sumArr = tester.getSum(array);
		Assert.assertEquals(10, sumArr);
	}

	/**
	 * Tests the method that prints the elements of a given array.
	 */
	@Test
	public void testPrintArray() {
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		tester.printArray(array);
	}
}
