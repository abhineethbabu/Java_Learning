package com.assg;

import java.util.Collections;

public class q1 {
	
	public static String reverse(String str) {
		String newStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			newStr += str.charAt(i);
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abhineeth");
		System.out.println("Program to Reverse a string");
		System.out.println("String before => " + str);
		str = reverse(str);
		System.out.println("String After=> " + str);
		
	}

}
