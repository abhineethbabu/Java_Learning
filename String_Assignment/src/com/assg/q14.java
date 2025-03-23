package com.assg;

import java.util.Scanner;

public class q14 {
	
	public static String formatName(String fullName) {
        String[] nameArr = fullName.split(" "); 
        String first = nameArr[0];
        String last = nameArr[nameArr.length - 1];
        StringBuilder mid = new StringBuilder();
        if(nameArr.length>2) {
           for (int i = 1; i < nameArr.length - 1; i++) {
               mid.append(nameArr[i]).append(" ");
           }
        }
        String allMid = mid.toString().trim();
        return last+", "+first+(allMid.isEmpty()?"":" "+allMid);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Full Name Formatter");
		Scanner sc = new Scanner(System.in);
        System.out.print("Full Name => ");
        String fullName = sc.nextLine();

        String ans = formatName(fullName);
        System.out.println("Formatted Name => " + ans);

	}

}
