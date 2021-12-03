package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramPalindrome {

	ArrayList<Integer> array = new ArrayList<Integer>();

	public void isPrimeNum(int range) {

		for (int num = 0; num < range; num++) {
			int count = 0;
			if (num == 0 || num == 1) {
				continue;
			} else {
				for (int j = 2; j <= num / 2; j++) {
					if (num % j == 0) {
						count++;
					}
				}
				if (count == 0) {
					array.add(num);
				}
			}
		}
		palindrome();
		anagram();
	}

	public void palindrome() {
		System.out.println("Prime numbers which are palindromes within range  : ");
		for (Integer num : array) {
			int temp = num;
			int rem = 0;
			int rev = 0;
			while (num > 0) {
				rem = num % 10;
				num = num / 10;
				rev = rev * 10 + rem;
			}
			if (temp == rev) {
				System.out.print(rev + " ");
			}
		}
	}

	public void anagram() {
		System.out.println("Prime numbers which are anagram within range  : ");
		for (int i = 0; i < array.size(); i++) {
			int num1 = array.get(i);
			String sNum1 = Integer.toString(num1);
			for (int j = i + 1; j < array.size(); j++) {
				int num2 = array.get(j);
				String sNum2 = Integer.toString(num2);
				if (sNum1.length()==sNum2.length()) {

					char[] cNum1 = sNum1.toCharArray();
					char[] cNum2 = sNum2.toCharArray();
					Arrays.sort(cNum1);
					Arrays.sort(cNum2);
					if(cNum1.equals(cNum2)) {
						System.out.println("num1 :"+cNum1+"num2 :"+cNum2);
					}
				}
			}

		}

	}

}
