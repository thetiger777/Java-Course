package com.sirma.itt.javacourse.intro;

import java.util.Arrays;
import java.util.Collection;

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
public class test123 {

	private int number;

	public test123(int number) {
		this.number = number;
	}

	@Parameters
	public static Collection<Object[]> data(test123 Array) {
		Object[][] data = new Object[][] { { 1 }, { 2 }, { 3 }, { 4 } };
		return Arrays.asList(data);
	}

	@Test
	public void pushTest(test123 Array) {
		System.out.println("Parameterized Number is : " + number);
	}
}