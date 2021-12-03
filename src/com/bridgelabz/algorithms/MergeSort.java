package com.bridgelabz.algorithms;

public class MergeSort<T> {

	public<T extends Comparable<T>> void mergeSort(T[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}

	}

	private <T extends Comparable<T>> void merge(T[] a, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		String L[] = new String[n1];
		String R[] = new String[n2];
		

		for (int i = 0; i < n1; i++)
			L[i] = (String) a[low + i];
		for (int j = 0; j < n2; j++)
			R[j] = (String) a[mid + 1 + j];
		
		int i, j, k;
		i = 0;
		j = 0;
		k = low;

		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j])>0) {
				a[k] = (T) L[i];
				i++;
			} else {
				a[k] = (T) R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			a[k] = (T) L[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = (T) R[j];
			j++;
			k++;
		}
	}
}