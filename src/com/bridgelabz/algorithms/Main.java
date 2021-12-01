package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = "Read,in,a,passage,of,words,from,File";
		String[] strArray = string.split(",");
		Arrays.sort(strArray);
		int first = 0;
		int last = strArray.length - 1;

		System.out.println("Enter word to search : ");
		String word = sc.next();

		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.binarySearch(strArray, first, last, word);
		if (result == -1) {
			System.out.println(" not Found the word");
		} else {
			System.out.println(" Found the word at index : " + result);
		}
		sc.close();
	}

}
