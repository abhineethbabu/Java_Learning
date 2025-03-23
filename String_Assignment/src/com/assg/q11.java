package com.assg;

public class q11 {
	
	public static int stoi(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ans = ans * 10 + (c - '0'); 
        }
        return ans; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "8008";
		System.out.println("String to integer");
		int ans = stoi(str);
		System.out.println("Int => "+ ans);
		
		

	}

}
