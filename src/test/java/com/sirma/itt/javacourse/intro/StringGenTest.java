package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class StringGenTest {

	@Test
	public void testRandomString() {
		int length;
		int index;
		boolean check;
		String possible = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
		String test;
		length = 25;
		StringGen tester = new StringGen();
		test = tester.randomString(length);
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
