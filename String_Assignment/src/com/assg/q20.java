package com.assg;

import java.util.Scanner;

public class q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Uppercase and Lowercase");
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter str => ");
        String str = sc.nextLine();
        String up = str.toUpperCase();
        System.out.println("Uppercase => " + up);
        String lo = str.toLowerCase();
        System.out.println("Lowercase => " + lo);

	}

}
