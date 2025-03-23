package com.assg;

import java.util.Scanner;

public class q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find Char in String");
		Scanner sc = new Scanner(System.in);
		String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("Enter Char => ");
        char ch = sc.next().charAt(0);
        System.out.println("Ans => "+ str.indexOf(ch));
        
        
        
	}

}
