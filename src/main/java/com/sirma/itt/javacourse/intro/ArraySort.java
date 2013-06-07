package com.sirma.itt.javacourse.intro;

/**
 * Implements the QuickSort method for a given array.
 * 
 * @author Vasko
 */
public class ArraySort {

	/**
	 * Makes partition.
	 * 
	 * @param args
	 */
	public int partition(int[] array, int left, int right) {
		int i = left;
		int j = right;
		int temp;
		int pivot = array[(left + right) / 2];
		while (i <= j) {
			while (array[i] < pivot)
				i++;
			while (array[j] > pivot)
				j--;
			if (i <= j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		return i;
	}

	/**
	 * The recursion part of the quickSort. It sorts the array.
	 * 
	 * @param array
	 *            it is the array that is being sorted.
	 * @param left
	 * @param right
	 */
	public void quickSort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1)
			quickSort(array, left, index - 1);
		if (index < right)
			quickSort(array, index, right);
	}

	/**
	 * @param array
	 *            the array to be sorted.
	 */
	public void sort(int[] array) {
		int i = 0;
		int k = 0;
		for (i = 0; i < array.length; i++) {
			k = i;
		}
		quickSort(array, 0, k);
	}
}
