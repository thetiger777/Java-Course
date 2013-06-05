package com.sirma.itt.javacourse.intro;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * The game Hangman, you must enter a word and then guess it symbol by symbol.
 * 
 * @author Vasko
 */
public class Hangman {

	/**
	 * @param args
	 */

	public static void hanging(String correct) {
		// TODO Auto-generated method stub
		int wronglet = 0;
		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String trying = null;
		StringBuilder temp = new StringBuilder(correct.length());

		temp.setLength(correct.length());
		for (int i = 0; i < correct.length(); i++) {

			temp.setCharAt(i, '_');
		}

		System.out.println("You have to guess a word with " + correct.length()
				+ " letters. You have " + (correct.length() + 4)
				+ " tries. You can make 6 mistakes.");
		System.out.println(temp);
		for (int i = 0; i < (correct.length() + 4); i++) {
			int k = 0;

			try {
				trying = br.readLine();
			} catch (Exception e) {
			}

			for (int j = 0; j < correct.length(); j++) {
				if (trying.charAt(0) == correct.charAt(j)) {
					temp.setCharAt(j, correct.charAt(j));

				} else {
					k++;
				}
				if (k == correct.length()) {
					System.out.println("Wrong letter.");
					wronglet++;
				}
			}
			if (wronglet == 6) {
				i = (correct.length() + 4);
				System.out.println("You Lose :(");
			}

			if (temp.toString().equals(correct)) {
				i = (correct.length() + 4);
				System.out.println("You Win :)");
			}
			System.out.println(temp);
		}
	}

	/**
	 * As automated testing is impossible, testing is done by using the 'main'
	 * function.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String correct;
		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		correct = null;

		System.out.println("Enter the correct word: ");
		try {
			correct = br.readLine();
		} catch (Exception e) {
		}
		hanging(correct);
	}
}
