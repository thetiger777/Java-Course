package com.sirma.itt.javacourse.objects;

import java.math.BigInteger;

/**
 * The class sums 'a' and 'b' of different types, the method used is sum.
 * 
 * @author Vasko
 */
public class Sumator {
	/*
	 * Sums integers
	 */

	class IntSumator extends Sumator {

		public int sum(int a, int b) {
			return a + b;
		}
	}

	/*
	 * Sums floats
	 */

	class FlPointSumator extends Sumator {

		public double sum(double a, double b) {
			return a + b;
		}
	}

	/*
	 * Adds a String to another String.
	 */
	class StringSumator extends Sumator {

		public String sum(String a, String b) {
			return a + b;
		}
	}

	/*
	 * Sums two BigIntegers. As they are immutable, a new variable is used.
	 */
	class BigIntSumator extends Sumator {
		private BigInteger a;
		private BigInteger b;

		public BigInteger sum(BigInteger a, BigInteger b) {
			BigInteger sum = new BigInteger("0");
			sum = sum.add(a);
			sum = sum.add(b);
			return sum;
		}
	}

	/**
	 * The main test class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumator Summer = new Sumator();
		StringSumator sumStr = Summer.new StringSumator();
		FlPointSumator sumFl = Summer.new FlPointSumator();
		IntSumator sumInt = Summer.new IntSumator();
		BigIntSumator sumBig = Summer.new BigIntSumator();

		System.out.println("Strings: " + sumStr.sum("2", "5"));
		System.out.println("Integers: " + sumInt.sum(2, 5));
		System.out.println("Floats: " + sumFl.sum(2.01, 3.44));
		BigInteger a = new BigInteger("2222222222222222222222222");
		BigInteger b = new BigInteger(
				"22222222222222222222222222222222222222222222222222222222222222222");
		System.out.println("BigIntegers: " + sumBig.sum(a, b));
	}
}
