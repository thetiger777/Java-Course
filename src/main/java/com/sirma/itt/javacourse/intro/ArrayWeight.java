package com.sirma.itt.javacourse.intro;

public class ArrayWeight {

	/**
	 * @param args
	 */

	public static int weightCenter(int[] arr) {
		if (0 == arr.length) {
			return -1;
		}
		if (1 == arr.length) {
			return 0;
		}

		int k, r;
		int s1 = 0, s2 = 0, delta, mindelta;

		for (k = 1; k < arr.length; k++) {
			s2 += arr[k];
		}

		r = 0;
		mindelta = Math.abs(s2 - s1);

		for (k = 1; k < arr.length; k++) {
			s1 += arr[k - 1];
			s2 -= arr[k];

			delta = Math.abs(s1 - s2);
			if (delta < mindelta) {
				mindelta = delta;
				r = k;

			} else
				return r + 1;
		}

		return r + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5 };
		System.out.println("The element, which is the weight center: "
				+ weightCenter(array));
	}

}
