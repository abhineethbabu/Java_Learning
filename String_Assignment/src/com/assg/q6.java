package com.assg;

public class q6 {
	
	public static String reverseWords(String str) {
        String[] arr = str.split(" "); 
        String newStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            newStr += arr[i]; 
            newStr += " ";
        }
        return newStr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Word Reversal Program");
		String str = "Banana is a Fruit";
        System.out.println("Sentence After => " + str);
        String ans = reverseWords(str);
        System.out.println("Sentence Before => " + ans);
	}

}
