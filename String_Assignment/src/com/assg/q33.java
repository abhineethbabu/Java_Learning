package com.assg;

public class q33 {
	
	public static String lps(String str) {
		int n = str.length();
		int len = 0;
		String ans = "";
		for(int i=0; i<n; i++) {
			int l = i;
			int r = i;
			while(l>=0 && r<n && str.charAt(l)==str.charAt(r)) {
				if(r-l+1 > len) {
					len = r-l+1;
					ans = str.substring(l, r+1);
				}
				l--;
				r++;
			}
			l = i;
			r = i+1;
			while(l>=0 && r<n && str.charAt(l)==str.charAt(r)) {
				if(r-l+1 > len) {
					len = r-l+1;
					ans = str.substring(l, r+1);
				}
				l--;
				r++;
			}
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find longest palindromic substring");
		String str = "bananas";
		String ans = lps(str);
		System.out.println("Ans => "+ans);

	}

}
