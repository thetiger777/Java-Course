package com.sirma.itt.javacourse.intro;

/**
 * Sums two numbers, they are given as strings.
 * 
 * @author Vasko
 */
public class NumberStrings {

	/**
	 * Sums two numbers, given as strings, by taking them apart character by
	 * character.
	 * 
	 * @param number1
	 *            is the first string for the summing
	 * @param number2
	 *            is the second string for the summing
	 * @return answer is the value of the two summed strings.
	 */
	public String plus(String number1, String number2) {

		int[] num1 = new int[number1.length()];
		int[] num2 = new int[number2.length()];
		String answer = "";
		int bigLength = 0;
		int littleLength = 0;
		int diffLength = 0;
		char buf = '0';

		if (number1.length() > number2.length()) {
			bigLength = number1.length();
			littleLength = number2.length();
		} else {
			bigLength = number2.length();
			littleLength = number1.length();
		}

		diffLength = bigLength - littleLength;
		int[] answ = new int[bigLength + 1];

		for (int i = 0; i < number1.length(); i++) {
			buf = number1.charAt(i);
			num1[i] = Character.getNumericValue(buf);
		}

		for (int i = 0; i < number2.length(); i++) {
			buf = number2.charAt(i);
			num2[i] = Character.getNumericValue(buf);
		}

		for (int i = 0; i < littleLength; i++) {
			answ[bigLength - i] += num1[number1.length() - 1 - i]
					+ num2[number2.length() - 1 - i];
			if (answ[bigLength - i] > 9) {
				answ[bigLength - i] = answ[bigLength - i] % 10;
				answ[bigLength - i - 1] = 1;
			}
		}

		if (bigLength == number1.length()) {
			for (int i = 0; i < diffLength; i++) {
				answ[diffLength - i] += num1[diffLength - i - 1];
				if (answ[diffLength - i] > 9) {
					answ[diffLength - i] = answ[diffLength - i] % 10;
					answ[diffLength - i - 1] = 1;
				} else {
					answ[diffLength - i - 1] = 0;
				}
			}
		} else {
			for (int i = 0; i < diffLength; i++) {
				answ[diffLength - i] += num2[diffLength - i - 1];
				if (answ[diffLength - i] > 9) {
					answ[diffLength - i] = answ[diffLength - i] % 10;
					answ[diffLength - i - 1] = 1;
				} else {
					answ[diffLength - i - 1] = 0;
				}
			}
		}

		if (answ[0] == 0) {
			for (int i = 0; i < answ.length - 1; i++) {
				answer += answ[i + 1];
			}
		} else {
			for (int i = 0; i < answ.length; i++) {
				answer += answ[i];
			}
		}

		return answer;
	}
}
