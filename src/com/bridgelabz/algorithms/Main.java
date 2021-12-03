package com.bridgelabz.algorithms;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = { 52, 35, 42, 12, 50 };
		MergeSort mergeSort=new MergeSort();
		int low=0;
		int high=arr.length-1;
		mergeSort.mergeSort(arr, low, high);
		System.out.println("Sorted Array :  " + Arrays.toString(arr));
	}

}
