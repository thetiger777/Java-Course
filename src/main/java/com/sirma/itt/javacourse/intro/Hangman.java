package com.sirma.itt.javacourse.intro;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hangman {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wronglet = 0;
		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String trying = null;
		String correct = "harrypotter";
		StringBuilder temp = new StringBuilder("                             ");

		// temp.setCharAt((correct.length() - 1), ' ');
		// String temp = "";

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
			if (temp.equals(correct)) {
				i = (correct.length() + 4);
				System.out.println("You Win :)");
			}
			System.out.println(temp);
		}
	}
}
