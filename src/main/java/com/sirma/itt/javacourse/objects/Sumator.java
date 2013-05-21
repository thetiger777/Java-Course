package com.sirma.itt.javacourse.objects;

public class Sumator {

	public static int sum(int numInt, int numInt2) {
		return numInt + numInt2;
	}

	public static double sum(double numFloat, double numFloat2) {
		return numFloat + numFloat2;
	}

	public static String sum(String str1, String str2) {
		String s = str1 + str2;
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Strings: " + sum("2", "5"));
		System.out.println("Integers: " + sum(2, 5));
		System.out.println("Floats: " + sum(2.01, 3.44));

	}

}
