package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//for String 
		String string = "Read,in,a,passage,of,words,from,File";
		String[] strArray = string.split(",");
		Arrays.sort(strArray);
		Integer first = 0;
		Integer last = strArray.length ;
		System.out.print("Enter word to search : ");
		String word=sc.nextLine();
		BinarySearch<String> stringSearch = new BinarySearch<String>();
		int result = stringSearch.binarySearch(strArray, first, last, word);
		stringSearch.result(result);
		
		//for Integers
		Integer[] intarray= {21,23,65,43,22};
		Arrays.sort(intarray);
		int intfirst = 0;
		int intlast=intarray.length;
		System.out.print("Enter num to search : ");
		Integer data =sc.nextInt();
		BinarySearch<Integer> integerSearch = new BinarySearch<Integer>();
		int intresult = integerSearch.binarySearch(intarray, intfirst, intlast, data);
		integerSearch.result(intresult);
	}

}
