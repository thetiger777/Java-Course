package com.sirma.itt.javacourse.intro;

public class ReverseArr {

	/**
	 * Reverses an array without using another array.
	 * 
	 * @param args
	 */
	public void reverse(int[] arr) {
		int i = arr.length;
		int buf = 0;
		for (int j = 0; j < i / 2; j++) {
			buf = arr[j];
			arr[j] = arr[i - (j + 1)];
			arr[i - (j + 1)] = buf;
		}
	}
}
