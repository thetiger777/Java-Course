package com.sirma.itt.javacourse.objects;

import java.math.BigInteger;

/**
 * The class sums 'a' and 'b' of different types, the method used is sum.
 * 
 * @author Vasko
 */
public class Sumator {
	/**
	 * Sums integers.
	 */
	class IntSumator extends Sumator {

		/**
		 * @param a
		 *            is the first integer.
		 * @param b
		 *            is the second integer.
		 * @return is the result.
		 */
		public int sum(int a, int b) {
			return a + b;
		}
	}

	/**
	 * Sums floats.
	 */
	class FlPointSumator extends Sumator {

		/**
		 * @param a
		 *            is the first float point.
		 * @param b
		 *            is the second float point.
		 * @return is the result.
		 */
		public double sum(double a, double b) {
			return a + b;
		}
	}

	/**
	 * Adds a String to another String.
	 */
	class StringSumator extends Sumator {

		/**
		 * @param a
		 *            is the first String.
		 * @param b
		 *            is the second String.
		 * @return is the result.
		 */
		public String sum(String a, String b) {
			return a + b;
		}
	}

	/**
	 * Sums two BigIntegers. As they are immutable, a new variable is used.
	 */
	class BigIntSumator extends Sumator {
		/**
		 * @param a
		 *            is the first BigInteger.
		 * @param b
		 *            is the second BigInteger.
		 * @return is the result.
		 */
		public BigInteger sum(BigInteger a, BigInteger b) {
			BigInteger sum = new BigInteger("0");
			sum = sum.add(a);
			sum = sum.add(b);
			return sum;
		}
	}

	/**
	 * The main test class.
	 * 
	 * @param args
	 *            the main method args.
	 */
	public static void main(String[] args) {

		BigInteger a = new BigInteger("2222222222222222222222222");
		BigInteger b = new BigInteger(
				"22222222222222222222222222222222222222222222222222222222222222222");
		Sumator summer = new Sumator();
		StringSumator sumStr = summer.new StringSumator();
		FlPointSumator sumFl = summer.new FlPointSumator();
		IntSumator sumInt = summer.new IntSumator();
		BigIntSumator sumBig = summer.new BigIntSumator();

		System.out.println("Strings: " + sumStr.sum("2", "5"));
		System.out.println("Integers: " + sumInt.sum(2, 5));
		System.out.println("Floats: " + sumFl.sum(2.01, 3.44));
		System.out.println("BigIntegers: " + sumBig.sum(a, b));
	}
}
