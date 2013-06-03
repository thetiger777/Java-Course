package com.sirma.itt.javacourse.intro;

public class ArrayWeight {

	/**
	 * Calculates the weight center of a given array by comparing the sums of
	 * it's elements
	 * 
	 * @param args
	 */

	public static int weightCenter(int[] arr) {
		if (0 == arr.length) {
			return -1;
		}
		if (1 == arr.length) {
			return 0;
		}

		int k;
		int counter = 0;
		int sum1 = 0;
		int sum2 = 0;
		int delta;
		int mindelta;

		for (k = 1; k < arr.length; k++) {
			sum2 += arr[k];
		}

		mindelta = Math.abs(sum2 - sum1);

		for (k = 1; k < arr.length; k++) {
			sum1 += arr[k - 1];
			sum2 -= arr[k];

			delta = Math.abs(sum1 - sum2);
			if (delta < mindelta) {
				mindelta = delta;
				counter = k;

			} else
				return counter + 1;
		}

		return counter + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		weightCenter(array);
	}

}
