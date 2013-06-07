package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Tests the random string generation class, it essentially only checks if the
 * generated string is in the boundaries of the requirements.
 * 
 * @author Vasko
 */
public class StringGenTest {

	/**
	 * Tests the method that generates a random string. It gives the characters
	 * to be used, the length of the random string and after that checks if the
	 * generated string is within these boundaries.
	 */
	@Test
	public void testRandomString() {
		int length;
		int index;
		boolean check;
		String possible = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
		String test;
		length = 25;
		StringGen tester = new StringGen();
		test = tester.randomizing(length, possible);
		for (int i = 0; i < test.length(); i++) {
			check = false;
			index = possible.indexOf(test.charAt(i));
			if ((index <= possible.length()) && (index > -1)) {
				check = true;
			}
			Assert.assertEquals(true, check);
		}
	}
}
