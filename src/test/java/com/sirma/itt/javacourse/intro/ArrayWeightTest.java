package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Tests the class ArrayWeight that returns the weight of an array.
 * 
 * @author Vasko
 */
public class ArrayWeightTest {

	/**
	 * Gives an array to the tested method and compares the real weight with the
	 * one received from the tested method.
	 */
	@Test
	public void testWeightCenter() {
		int center;
		int[] array = { 1, 25, 3, 6, 2, 7, 11 };
		ArrayWeight tester = new ArrayWeight();
		center = tester.weightCenter(array);
		Assert.assertEquals(3, center);
	}

}
