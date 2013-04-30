package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class ArrayWeightTest {

	@Test
	public void testWeightCenter() {
		int center;
		int[] array = { 1, 25, 3, 6, 2, 7, 11 };
		ArrayWeight tester = new ArrayWeight();
		center = tester.weightCenter(array);
		Assert.assertEquals(3, center);
	}

}
