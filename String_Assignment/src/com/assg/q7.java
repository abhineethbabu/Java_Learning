package com.assg;

import java.util.Arrays;

public class q7 {
	public static String lcp(String[] str) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        int size = Math.min(s1.length(), s2.length());
        for (int i=0; i<size; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return ans.toString();
            }
            ans.append(s1.charAt(i));
        }
        return ans.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Longest Common Prefix Program");
		String[] str = {"apple", "applejuice", "apply"};
        System.out.println("Input => " + Arrays.toString(str));
        String result = lcp(str);
        System.out.println("\nLongest Common Prefix: " + result);
	}

}
