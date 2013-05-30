package com.sirma.itt.javacourse.objects;

public class Sumator {

	static class IntSumator extends Sumator {

		public static int sum(int a, int b) {
			return a + b;
		}

	}

	static class FlPointSumator extends Sumator {

		public static double sum(double a, double b) {
			return a + b;
		}

	}

	static class StringSumator extends Sumator {

		public String sum(String a, String b) {
			String s = a + b;
			return s;
		}
	}

	static class BigIntSumator extends Sumator {

		// public BigInteger sum(BigInteger bigInt1, BigInteger bigInt2) {
		// return bigInt1 + bigInt2;
		// }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSumator a = new StringSumator();
		a.sum(null, null); // AVOID
		System.out.println("Strings: " + StringSumator.sum("2", "5"));
		System.out.println("Integers: " + IntSumator.sum(2, 5));
		System.out.println("Floats: " + FlPointSumator.sum(2.01, 3.44));
		// BigInteger("asd", 10);
	}
}
