package com.bridgelabz.algorithms;

public class Main {

	public static void main(String[] args) {
		
		Integer[] arr = { 52, 35, 42, 12, 50 };
		InsertionSort<Integer> integerSort=new InsertionSort<Integer>();
		integerSort.sort(arr);
		
		String[] s={"hi","mani","hello","bye"};
		InsertionSort<String> stringSort2 = new InsertionSort<String>();
		stringSort2.sort(s);

	}

}
