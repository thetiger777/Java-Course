package com.sirma.itt.javacourse.intro;

public class Array {

	/**
	 * @param args
	 */

	public int getMinElement(int[] array) {
		int minElem = 2147483647; // the maximum of integer
		for (int i = 0; i < array.length; i++) {
			if (minElem > array[i]) {
				minElem = array[i];
			}
		}
		return minElem;
	}

	public int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public void printArray(int[] array) {
		System.out.println("The elements of the array:");
		for (int i = 0; i < array.length; i++) {
			System.out.printf(" " + array[i]);
		}
	}
}
