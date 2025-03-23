package com.assg;

public class q28 {
	
	public static boolean check(String str, String sub) {
		return str.contains(sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to check substing in a string");
		String str = "Abhineeth";
		String sub = "neeth";
		System.out.println("String => "+str+"\nSub => "+sub + "\nAns => "+check(str,sub));

	}

}
