package com.bridgelabz.algorithms;

public class Main {

	public static void main(String[] args) {
		
		Integer[] intArr = { 52, 35, 42, 12, 50 };
		BubbleSort<Integer> integerSort=new BubbleSort<Integer>();
		integerSort.sort(intArr);
		
		String[] strArr={"hi","mani","hello","bye"};
		BubbleSort<String> stringSort = new BubbleSort<String>();
		stringSort.sort(strArr);

	}

}
