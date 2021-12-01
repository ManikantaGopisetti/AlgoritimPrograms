package com.bridgelabz.algorithms;

public class BinarySearch {

	public int binarySearch(String[] array, int first, int last, String word) {

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
}
