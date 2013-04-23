package com.sirma.itt.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

	@Test
	public void testGetMinElement() {
		int minEl = 0;
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		minEl = tester.getMinElement(array);
		Assert.assertEquals(1, minEl);
	}

	@Test
	public void testGetSum() {
		int sumArr = 0;
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, };
		sumArr = tester.getSum(array);
		Assert.assertEquals(10, sumArr);
	}

	@Test
	public void testPrintArray() {
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		tester.printArray(array);
	}
}