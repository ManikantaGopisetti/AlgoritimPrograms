package com.bridgelabz.algorithms;

import java.util.Arrays;

public class Anagram {

	public boolean anagramDetect(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// check if length is same
		if (str1.length() == str2.length()) {

			// convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray1, charArray2)) {
				return true;
			}
		}
		return false;
	}
}
