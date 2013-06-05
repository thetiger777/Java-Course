package com.sirma.itt.javacourse.intro;

public class StringGen {

	/**
	 * Generates a string, made of random characters. Used method -
	 * Math.random() for generating random numbers.
	 * 
	 * @param args
	 */
	public String randomizing(int length, String possible) {

		String text = "";

		for (int i = 0; i < length; i++) {
			text += possible.charAt((int) Math.floor(Math.random()
					* possible.length()));
		}
		return text;
	}
}
