package com.assg;

public class q9 {
	
	public static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String temp = s1 + s1;
        return temp.contains(s2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Substring rotaion finder");
		String s1 = "abhineeth";
		String s2 = "neethabhi";
		if(checkRotation(s1,s2)) System.out.println("True");
		else System.out.println("False");

	}

}
