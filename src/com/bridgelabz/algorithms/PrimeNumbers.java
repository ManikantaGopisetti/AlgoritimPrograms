package com.bridgelabz.algorithms;

public class PrimeNumbers {

	public void isPrimeNum(int range) {
		System.out.println("Prime numbers within range "+range+" : ");
		for (int i = 0; i < range; i++) {
			int count = 0;
			if (i == 0 || i == 1) {
				continue;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
