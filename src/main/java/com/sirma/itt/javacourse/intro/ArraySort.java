package com.sirma.itt.javacourse.intro;

public class ArraySort {

	/**
	 * @param args
	 */
	public static int partition(int[] arr, int left, int right) {
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

	public static void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public static void sort(int[] arr) {
		System.out.println("Original array:");
		int i = 0;
		int k = 0;
		for (i = 0; i < arr.length; i++) {
			System.out.printf(" " + arr[i]);
			k = i;
		}
		quickSort(arr, 0, k);
		System.out.println("");
		System.out.println("Quicksorted array:");
		for (i = 0; i < arr.length; i++) {
			System.out.printf(" " + arr[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 23, 5, 6, 7, 8, 9, 8, 7, 6, 5, 22 };
		sort(array);

	}
}
