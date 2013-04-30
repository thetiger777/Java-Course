package com.sirma.itt.javacourse.intro;

public class StringGen {

	/**
	 * @param args
	 */
	public static String randomString(int length) {

		String possible = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
		String text = "";

		for (int i = 0; i < length; i++) {
			text += possible.charAt((int) Math.floor(Math.random()
					* possible.length()));
		}
		System.out.println("All possible symbols:  " + possible);
		System.out.println("Exact number of possible symbols: "
				+ possible.length());
		System.out.println("Randomly generated string: " + text);
		System.out.println("Length of the random string: " + length);
		return text;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomString(55);
	}

}
