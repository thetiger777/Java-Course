package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Tests the class that returns the biggest common divisor and littlest common
 * multiple.
 * 
 * @author Vasko
 */
public class DivisorTest {

	/**
	 * Tests the method that returns the biggest common divisor.
	 */
	@Test
	public void testBiggestDivisor() {
		int numberOne = 7;
		int numberTwo = 77;
		Assert.assertEquals(7, Divisor.biggestDivisor(numberOne, numberTwo));
	}

	/**
	 * Tests the method that returns the littlest common multiple, using the
	 * biggest common divisor.
	 */
	@Test
	public void testLittleDivisor() {
		int litComMulti;
		int bigComDiv;
		int numberOne = 7;
		int numberTwo = 77;
		bigComDiv = Divisor.biggestDivisor(numberOne, numberTwo);
		litComMulti = Divisor.littleDivisor(numberOne, numberTwo, bigComDiv);
		Assert.assertEquals(77, litComMulti);
	}
}
