package com.assg;

import java.util.Scanner;

public class q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sub String");
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter str1 => ");
        String str1 = sc.next();
        System.out.print("Enter i => ");
        int i = sc.nextInt();
        System.out.print("Enter j => ");
        int j= sc.nextInt();
        
        System.out.println("Substring => "+str1.substring(i, j));
	}

}
