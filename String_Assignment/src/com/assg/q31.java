package com.assg;

import java.util.Scanner;

public class q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to verify email format");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email or Phone number =>");
		String str = sc.next();
		String validEmail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$";
		String validPhone = "^\\d{10}$";
		if (str.matches(validEmail)) System.out.println("Valid Email");
		else if (str.matches(validPhone)) System.out.println("Valid Phone number");
		else System.out.println("Not Valid");
		
	}

}
