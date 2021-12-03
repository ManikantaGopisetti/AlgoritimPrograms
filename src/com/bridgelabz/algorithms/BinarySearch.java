package com.bridgelabz.algorithms;

public class BinarySearch<T> {

	public <T extends Comparable<T>> Integer binarySearch(T[] array, int first, int last, T word) {

		int mid = (first + last) / 2;

		if (word.compareTo(array[mid]) == 0) {
			
			return mid; 
		}
		if(mid==first||mid==last) {
			return -1;
			
		} else if ((word.compareTo(array[mid])) > 0) {
		 
			return binarySearch(array, mid+1, last, word);
			
		} else if (word.compareTo(array[mid]) < 0) { 
			
			return binarySearch(array, first, mid-1, word);
			
		} 
		return -1;
	}
	public void result(int result) {
		if (result == -1) {
			System.out.println(" not Found the data");
		} else {
			System.out.println(" Found the data at index : " + result);
		}
	}
}
