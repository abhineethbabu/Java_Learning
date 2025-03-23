package com.assg;

import java.util.Scanner;

public class q34 {

	private static void permute(String str, int l, int r) {
		if (l == r) {
			System.out.println(str); 
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i); 
				permute(str, l + 1, r); 
				str = swap(str, l, i); 
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Program to print all the permutaion of a string");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to print permutation => ");
        String str = sc.next();  
        System.out.println("Permutation => ");
        permute(str, 0, str.length() - 1);

	}
}
