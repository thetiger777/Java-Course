package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class NumberStringsTest {

	@Test
	public void testPlus() {
		int i;
		int arr[];
		int expected[] = { 1, 1, 5, 5, 9, 0, 4, 3, 5, 6, 2, 6, 0, 7, 4 };
		NumberStrings tester = new NumberStrings();
		String number1 = "115555222112553";
		String number2 = "35213513521";
		arr = tester.plus(number1, number2);
		for (i = 0; i < arr.length; i++) {
			Assert.assertEquals(expected[i], arr[i]);
		}
	}

}
