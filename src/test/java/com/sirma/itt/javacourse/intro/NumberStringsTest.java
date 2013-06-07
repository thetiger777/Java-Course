package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Tests the class NumberStrings, which adds two strings as numbers.
 * 
 * @author Vasko
 */
public class NumberStringsTest {

	/**
	 * Tests the method that sums the two Strings as numbers.
	 */
	@Test
	public void testPlus() {
		String ans;
		String expected = "115590435626074";
		NumberStrings tester = new NumberStrings();
		String number1 = "115555222112553";
		String number2 = "35213513521";
		ans = tester.plus(number1, number2);
		Assert.assertEquals(expected, ans);
	}
}
