package com.assg;

import java.util.*;

public class q10 {
	
	public static String remDup(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
        	set.add(c); 
        }
        StringBuilder ans = new StringBuilder("");
        for (char c : set) {
            ans.append(c);  
        }
        return ans.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Remove duplicates from string");
		String s1 = "aabbbcdeeef";
        System.out.println("String before => " + s1);
		String ans = remDup(s1);
        System.out.println("String after => " + ans);
		

	}

}
