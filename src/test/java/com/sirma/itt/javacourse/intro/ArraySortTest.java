package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class ArraySortTest {

	@Test
	public void testDisplay() {

		ArraySort tester = new ArraySort();
		int[] array = { 1, 2, 3, 4, 23, 5, 6, 7, 8, 9, 8, 7, 6, 5, 22 };
		int[] sarray = { 1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 22, 23 };
		tester.sort(array);

		for (int i = 0; i < array.length; i++) {
			Assert.assertEquals(array[i], sarray[i]);
		}
	}
}