package com.assg;

import java.util.Scanner;

public class q15 {
	
	public static int shift = 7;
	
	public static String encrypt(String str) {
        StringBuilder cypher = new StringBuilder("");
        for (char c : str.toCharArray()) {
        	if(c == ' ') {
        		cypher.append(" ");
        		continue;
        	}
        	char charMinus = Character.isLowerCase(c) ? 'a' : 'A';
        	char encryptedChar = (char) ((c - charMinus + shift) % 26 + charMinus);
        	cypher.append(encryptedChar);
        }
        return cypher.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ceaser Cypher to encripta");
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text => ");
        String str = sc.nextLine();
        String cypher = encrypt(str);
        System.out.println("Cypher text => "+cypher);
	}

}
