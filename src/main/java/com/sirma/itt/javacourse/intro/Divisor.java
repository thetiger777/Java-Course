package com.sirma.itt.javacourse.intro;

/**
 * Finds the greatest common divisor and the least common multiple for 2
 * numbers.
 * 
 * @author Vasko
 */
public class Divisor {

	/**
	 * @param firstNum
	 *            - the first number given.
	 * @param secondNum
	 *            - the second number given.
	 * @return secondNum becomes the biggest common divisor after all the
	 *         actions
	 */
	public static int biggestDivisor(int firstNum, int secondNum) {
		while (firstNum != secondNum) {
			if (firstNum > secondNum) {
				firstNum = firstNum - secondNum;
			} else {
				secondNum = secondNum - firstNum;
			}
		}
		return secondNum;
	}

	/**
	 * @param bigComDiv
	 *            - the biggest common divisor
	 * @param firstNum
	 *            - the first number given.
	 * @param secondNum
	 *            - the second number given.
	 * @return litComMulti this is the littlest common multiplier
	 */
	public static int littleDivisor(int firstNum, int secondNum, int bigComDiv) {
		int litComMulti = (firstNum * secondNum) / bigComDiv;
		return litComMulti;
	}
}
