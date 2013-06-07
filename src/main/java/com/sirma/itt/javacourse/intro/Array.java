package com.sirma.itt.javacourse.intro;

/**
 * Works with an array. Has methods for getting the minimum element of the
 * array, getting the sum of all the elements and printing the array on the
 * screen.
 * 
 * @author Vasko
 */

public class Array {

	/**
	 * Gets the minimum element of the given array and returns it.
	 * 
	 * @param array
	 *            is the given array that is being used.
	 * @return minElem is the returned value of the minimum element of the array
	 */
	public int getMinElement(int[] array) {
		/*
		 * As there is no higher value integer, the 'if' will always work at
		 * least once.
		 */
		int minElem = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (minElem > array[i]) {
				minElem = array[i];
			}
		}
		return minElem;
	}

	/**
	 * Sums all the elements of the given array and returns the sum.
	 * 
	 * @param array
	 *            is the given array that is being used.
	 * @return sum - it returns the sum of the elements of the array as integer
	 */
	public int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	/**
	 * Prints all the elements of the given array.
	 * 
	 * @param array
	 *            is the given array that is being used.
	 */
	public void printArray(int[] array) {
		System.out.println("The elements of the array:");
		System.out.printf("[ " + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.printf(", " + array[i]);
		}
		System.out.printf(" ]");
	}
}
