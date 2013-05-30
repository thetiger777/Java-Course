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
	 */
	public int getMinElement(int[] array) {
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
	 */
	public void printArray(int[] array) {
		System.out.println("The elements of the array:");
		System.out.printf("[ " + array[1]);
		for (int i = 1; i < array.length; i++) {
			System.out.printf(", " + array[i]);
		}
		System.out.printf(" ]");

	}
}
