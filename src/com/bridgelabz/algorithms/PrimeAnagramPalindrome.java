package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramPalindrome {

	ArrayList<Integer> arraylist = new ArrayList<Integer>();

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
					arraylist.add(num);
				}
			}
		}
		palindrome();
		anagram();
	}

public void palindrome() {
		
		System.out.println("Prime numbers which are palindromes within range  : ");
		for (Integer num : arraylist) {
			int temp=num;
			int rem=0;
			int rev=0;
			while (num>0) {
				rem=num%10;
				num=num/10;
				rev=rev*10+rem;
			}
			if(rev==temp) {
				System.out.print(rev+" ");
			}
		}
	}

public void anagram() {
		System.out.println("\n Prime numbers which are anagram within range  : ");
		for (int i = 0; i < arraylist.size(); i++) {
			int num1 = arraylist.get(i);
			String sNum1 = Integer.toString(num1);
			for (int j = i + 1; j < arraylist.size(); j++) {
				int num2 = arraylist.get(j);
				String sNum2 = Integer.toString(num2);
				if (sNum1.length()==sNum2.length()) {

					char[] cNum1 = sNum1.toCharArray();
					char[] cNum2 = sNum2.toCharArray();
					Arrays.sort(cNum1);
					Arrays.sort(cNum2);
					if(Arrays.equals(cNum1, cNum2)) {
						System.out.println("num1 :"+num1+"num2 :"+num2);
					}
				}
			}
		}
	} 
}
