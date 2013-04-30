package com.sirma.itt.javacourse.intro;

import junit.framework.Assert;

import org.junit.Test;

public class DivisorTest {

	@Test
	public void testBiggestDivisor() {
		Divisor tester = new Divisor();
		int NOD;
		int numberOne = 7;
		int numberTwo = 77;
		NOD = tester.biggestDivisor(numberOne, numberTwo);
		Assert.assertEquals(7, NOD);
	}

	@Test
	public void testLittleDivisor() {
		Divisor tester = new Divisor();
		int NOK, NOD;
		int numberOne = 7;
		int numberTwo = 77;
		NOD = tester.biggestDivisor(numberOne, numberTwo);
		NOK = tester.littleDivisor(numberOne, numberTwo, NOD);
		Assert.assertEquals(77, NOK);
	}
}
