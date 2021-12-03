package com.bridgelabz.algorithms;
import java.util.Arrays;

public class InsertionSort<T> {

	public <T extends Comparable<T>> void sort(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			T element =arr[i];
			int index=i-1;
			while(index>=0) {
				if(arr[index].compareTo(element)>0) {
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
