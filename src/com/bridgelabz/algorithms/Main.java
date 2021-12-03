package com.bridgelabz.algorithms;

public class Main {

	public static void main(String[] args) {
		
		String str1="mani";
		String str2="anil";
		Anagram anagram=new Anagram();
		System.out.println("Given strings are Anagram : "+anagram.anagramDetect(str1, str2));
	}

}
