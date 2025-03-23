package com.assg;

import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Concat two strings");
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter str1 => ");
        String str1 = sc.nextLine();
        System.out.print("Enter str2 => ");
        String str2 = sc.nextLine();
        System.out.println("Concated String => "+str1.concat(str2));
	}

}
