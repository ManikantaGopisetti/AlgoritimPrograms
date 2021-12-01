package com.bridgelabz.algorithms;
import java.util.Arrays;

public class InsertionSort {

	public void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int element =arr[i];
			int index=i-1;
			while(index>=0) {
				if(arr[index]>element) {
					arr[index+1]=arr[index];
					index--;
				}else {
					break;
				}
			}
			arr[index+1]=element;
		}	
		System.out.println("Sorted Array :  " + Arrays.toString(arr));
	}
	
}
