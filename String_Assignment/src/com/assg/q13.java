package com.assg;

import java.util.*;

public class q13 {
	
	public static String countMaxFreq(String str) {
        HashMap<String, Integer> mp = new HashMap<>();
        
        for (String word : str.toLowerCase().split(" ")) {
            if (!word.isEmpty()) {
                mp.put(word, mp.getOrDefault(word, 0) + 1);
            }
        }
        String ans = null;
        int count = 0;
        for (HashMap.Entry<String, Integer> it : mp.entrySet()) {
            if (it.getValue() > count) {
                count = it.getValue();
                ans = it.getKey();
            }
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Word with max frequency");
		String str = "abhi apple orange apple apple abhi abhi orange abhi";
		String ans = countMaxFreq(str);
		System.out.println("Max Freq Word => "+ ans);
		
	}

}
