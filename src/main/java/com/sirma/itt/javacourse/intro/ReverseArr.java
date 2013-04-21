package com.sirma.itt.javacourse.intro;

public class ReverseArr {

	/**
	 * @param args
	 */
	public static void reverse(int[] arr) {
		int i = arr.length;
		int buf = 0;
		for (int j = 0; j < i / 2; j++) {
			buf = arr[j];
			arr[j] = arr[i - (j + 1)];
			arr[i - (j + 1)] = buf;
			for (int k = 0; k < i; k++) {
				System.out.print(" " + arr[k]);
			}
			System.out.println();
		}
		for (int k = 0; k < i; k++) {
			System.out.println("Element " + k + " = " + arr[k]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// System.out.println(arr.length);
		reverse(array);
	}
}
