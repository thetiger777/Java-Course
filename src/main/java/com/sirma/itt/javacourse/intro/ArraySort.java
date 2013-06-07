package com.sirma.itt.javacourse.intro;

/**
 * Implements the QuickSort method for a given array.
 * 
 * @author Vasko
 */
public class ArraySort {

	/**
	 * @param args
	 */
	public int partition(int[] arr, int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}

		return i;
	}

	public void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public void sort(int[] arr) {
		int i = 0;
		int k = 0;
		for (i = 0; i < arr.length; i++) {
			System.out.printf(" " + arr[i]);
			k = i;
		}
		quickSort(arr, 0, k);

	}
}
