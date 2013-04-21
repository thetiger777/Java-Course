package com.sirma.itt.javacourse.intro;

public class ArrayWeight {

	/**
	 * @param args
	 */

	public static int weightCenter(int[] arr) {
		if (0 == arr.length)
			return -1;
		if (1 == arr.length)
			return 0;

		int k;

		int sum1 = 0, sum2 = 0, delta, mindelta;

		for (k = 1; k < arr.length; k++) {
			sum2 += arr[k];
		}
		mindelta = Math.abs(sum2 - sum1);

		int r = 0;
		for (k = 1; k < arr.length; k++) {
			sum1 += arr[k - 1];
			sum2 -= arr[k];

			delta = Math.abs(sum1 - sum2);

			if (delta < mindelta) {
				mindelta = delta;
				r = k;

			} else
				return r;
		}

		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		System.out
				.println("The index of the element, which is the weight center: "
						+ weightCenter(array));
	}

}
