package com.assg;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String tokeniser");
		String str = "My name is Abhi";
		int i = 0;
		for(String s:str.split(" ")) {
			System.out.println("Token "+i+++" => "+s);
		}

	}

}
