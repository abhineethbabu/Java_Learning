package com.assg;

import java.util.Scanner;

public class q2 {
	public static boolean checkPalindrome(String str) {
		int i=0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i++)!=str.charAt(j--)) return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to check if a string is palindrome");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String=> ");
		String str = sc.next();
		if(checkPalindrome(str)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");

	}

}
