package com.sirma.itt.javacourse.intro;

public class NumberStrings {

	/**
	 * @param args
	 */
	public static int[] plus(String number1, String number2) {

		int a = number1.length(); // Does not include the 0 element (for array)
		int b = number2.length();
		int[] num1 = new int[a];
		int[] num2 = new int[b];
		int k = 0; // The bigger length
		int l = 0;
		int prenos = 0;
		char buf = '0';
		if (a > b) {
			k = a;
			l = b;
		} else {
			k = b;
			l = a;
		}
		int z = 0;
		z = k - l; // Difference in length
		int[] answ = new int[k];

		for (int i = 0; i < a; i++) {
			buf = number1.charAt(i);
			num1[i] = Character.getNumericValue(buf);
			System.out.print(num1[i]);
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < b; i++) {
			buf = number2.charAt(i);
			num2[i] = Character.getNumericValue(buf);
			System.out.print(num2[i]);
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < l; i++) {
			answ[k - 1 - i] = prenos + num1[a - 1 - i] + num2[b - 1 - i];
			if (answ[k - 1 - i] > 9) {
				answ[k - 1 - i] = answ[k - 1 - i] % 10;
				prenos = 1;
			} else {
				prenos = 0;
			}
		}

		if (k == a) {
			for (int i = 0; i < z; i++) {
				answ[i] = num1[i];
			}
		} else {
			for (int i = 0; i < z; i++) {
				answ[i] = num2[i];
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.print(answ[i] + " ");
		}
		return answ;
	}
}
