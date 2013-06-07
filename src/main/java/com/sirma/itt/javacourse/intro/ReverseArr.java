package com.sirma.itt.javacourse.intro;

/**
 * Reverses an array.
 * 
 * @author Vasko
 */
public class ReverseArr {

	/**
	 * Reverses an array without using another array. No other array than the
	 * one given is used.
	 * 
	 * @param array
	 *            is the given array that is being reverted.
	 */
	public void reverse(int[] array) {
		int i = array.length;
		int buf = 0;
		for (int j = 0; j < i / 2; j++) {
			buf = array[j];
			array[j] = array[i - (j + 1)];
			array[i - (j + 1)] = buf;
		}
	}
}
