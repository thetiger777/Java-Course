package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class ReverseArrTest {

	@Test
	public void testReverse() {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int rarray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		ReverseArr tester = new ReverseArr();
		tester.reverse(array);
		for (int i = 0; i < array.length; i++) {
			Assert.assertEquals(array[i], rarray[i]);
		}
	}
}
