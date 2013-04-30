package com.sirma.itt.javacourse.intro; // com.sirma.itt.javacourse.intro ??

public class Divisor {

	public static int biggestDivisor(int fNum, int sNum) { // NOD
		while (fNum != sNum) {
			if (fNum > sNum) {
				fNum = fNum - sNum;
			} else {
				sNum = sNum - fNum;
			}
		}
		return fNum;
	}

	public static int littleDivisor(int fNum, int sNum, int tNum) { // NOK
		int NOK = (fNum * sNum) / tNum;
		return NOK;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne = 77;
		int numberTwo = 7;
		int NOD;
		NOD = biggestDivisor(numberOne, numberTwo);
		System.out.println("NOD: " + NOD);
		System.out.println("NOK: " + littleDivisor(numberOne, numberTwo, NOD));
	}

}
