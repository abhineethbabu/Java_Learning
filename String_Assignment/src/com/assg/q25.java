package com.assg;

import java.util.Scanner;

public class q25 {
	
	public static String str= new String("apple is a fruit ");
	
	public static int countChar(char ch) {
		int count =0;
		for(char c:str.toCharArray()) {
			if(c==ch) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count occurance of char");
		System.out.println("String => "+str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char to count => ");
		int ans = countChar(sc.next().charAt(0));
		System.out.println("Count => "+ans);
	}

}
