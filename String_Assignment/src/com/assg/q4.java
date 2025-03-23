package com.assg;

import java.util.Scanner;

public class q4 {
	
	public static void count(String str) {
		String vow = "aeiou";
		int count = 0;
		char[] arr = str.toCharArray();
		for(char ch : arr) {
			if(vow.indexOf(ch)!=-1) count++;
		}

		System.out.println("Vowels=> "+count);
		count = arr.length-count;
		System.out.println("Consonants=> "+ count);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to count vovels and consonants");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String=> ");
		String str = sc.next();
		count(str);

	}

}
