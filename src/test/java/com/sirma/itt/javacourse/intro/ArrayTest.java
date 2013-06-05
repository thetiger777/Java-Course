package com.sirma.itt.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
	@Test
	public void testGetMinElement() {
		int minEl = 0;
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		minEl = tester.getMinElement(array);
		Assert.assertEquals(1, minEl);
	}

	@Test
	public void testGetSum() {
		int sumArr = 0;
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, };
		sumArr = tester.getSum(array);
		Assert.assertEquals(10, sumArr);
	}

	@Test
	public void testPrintArray() {
		Array tester = new Array();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		tester.printArray(array);
	}
}
/*
 * @RunWith(Parameterized.class) public class ArrayTest { private final int
 * testArray[]; private int expectedValidation[]; private Array tArray; public
 * ArrayTest(Array myTestArray) { this.testArray = myTestArray; }
 * @Before public void initialize() { tArray = new Array(); } public
 * ArrayTest(Array myTestArray, Array expectedValidation) { this.testArray =
 * myTestArray; this.expectedValidation = expectedValidation; }
 * @Parameterized.Parameters public static Collection testArrays() { return
 * Arrays.asList(new Object[][] { { { 1, 3, 2 }, { 1, 2, 3 } }, { { 1, 3, 2 }, {
 * 1, 2, 3 } } }); }
 * @Test public void testArray() { assertEquals(expectedValidation,
 * testArray.getSum(testArray)); } }
 */

