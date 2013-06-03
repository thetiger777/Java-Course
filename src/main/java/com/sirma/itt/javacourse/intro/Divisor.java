package com.sirma.itt.javacourse.intro;

/**
 * Finds the greatest common divisor and the least common multiple for 2
 * numbers.
 * 
 * @author Vasko
 */
public class Divisor {

	/**
	 * @param fNum
	 *            - the first number given.
	 * @param sNum
	 *            - the second number given.
	 * @return
	 */
	public static int biggestDivisor(int fNum, int sNum) {
		while (fNum != sNum) {
			if (fNum > sNum) {
				fNum = fNum - sNum;
			} else {
				sNum = sNum - fNum;
			}
		}
		return fNum;
	}

	/**
	 * @param NOD
	 *            - the biggest common divisor
	 * @param NOK
	 *            - the littlest common multiple
	 */
	public static int littleDivisor(int fNum, int sNum, int NOD) {
		int NOK = (fNum * sNum) / NOD;
		return NOK;
	}
}
