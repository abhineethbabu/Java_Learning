package com.assg;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {
	
	 public static boolean checkAnagrams(String str1, String str2) {
	        if (str1.length() != str2.length()) return false;
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        return Arrays.equals(arr1, arr2);
	 }
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Program to check if a two strings are anagram");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String1=> ");
			String str1 = sc.next();
			System.out.println("Enter String2=> ");
			String str2 = sc.next();
			if(checkAnagrams(str1,str2)) System.out.println("Anagram");
			else System.out.println("Not Anagram");

		}


}
