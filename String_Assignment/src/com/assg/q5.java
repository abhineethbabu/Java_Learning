package com.assg;

import java.util.Scanner;

public class q5 {
	
	public static String compress(String str) {
	    String temp = "";
	    int i = 0;
	    while (i < str.length()) {
	        int count = 1;
	        temp += str.charAt(i);
	        while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
	            count++;
	            i++;
	        }
	        if (count > 1) temp += String.valueOf(count);
	        i++;
	    }
	    
	    return temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Compression Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String=> ");
		String str = sc.next();
		String newStr = compress(str);
		System.out.println("Compressed string => "+newStr);
	}

}
