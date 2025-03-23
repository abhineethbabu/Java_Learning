package com.assg;


public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Split a String");
		String str = "apple is a fruit but its also a phone";
		System.out.println("String before Sprit => "+str);
		System.out.println("New String after Splitting => ");
		String[] strArr = str.split(" ");
		for(String word:strArr) {
			System.out.println(word);
		}
        
	}

}
