package com.sirma.itt.javacourse.intro;

/**
 * Generates a random string.
 */
public class StringGen {

	/**
	 * Generates a string, made of random characters, a string with which is
	 * given by the user.
	 * 
	 * @param length
	 *            is the length of the wanted random string.
	 * @param possible
	 *            is the string with all the symbols which the user wants to be
	 *            possible for the string.
	 * @return text it the random string.
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
