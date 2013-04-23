package com.sirma.itt.javacourse.intro;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * JUnit Parameterized Test
 * 
 * @author mkyong
 */
@RunWith(value = Parameterized.class)
public class TestArray2 {

	private final int[] input;
	private final int expected;

	public TestArray2(int[] input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { new int[] { 1, 2, 3, 4 }, 10 },
				{ 2, 2 }, { 3, 3 }, { 4, 3 } };
		return Arrays.asList(data);
	}

	@Test
	public void pushTest() {
		Array array = new Array();
		Assert.assertEquals(expected, array.getSum(input));
	}
}