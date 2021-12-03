package com.bridgelabz.algorithms;

import java.util.Arrays;

public class BubbleSort<T> {

	public <T extends Comparable<T>> void sort(T[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					T temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array :  " + Arrays.toString(a));
	}

}
