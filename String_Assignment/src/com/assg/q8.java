package com.assg;

public class q8 {
	
	public static int count(String str, String sub) {
        int count = 0;
        int i = 0;
        while ((i = str.indexOf(sub, i)) != -1) {
            count++;
            i += sub.length(); 
        }
        return count;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Substring Frequency finder");
		String str = "abcdeabcfabc";
		String sub = "abc";
		int ans = count(str,sub);
		System.out.println("Count => "+ ans );
		
	}

}
