package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class NumberStringsTest {

	@Test
	public void testPlus() {
		int i;
		String ans;
		String expected = "0115590435626074";
		NumberStrings tester = new NumberStrings();
		String number1 = "115555222112553";
		String number2 = "35213513521";
		ans = tester.plus(number1, number2);
		Assert.assertEquals(expected, ans);
	}

}
