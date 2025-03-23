package com.assg;

public class q32 {
	
	public static int dp(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int[][] dp = new int[m+1][n+1];
		dp[0][0] = 0;
		for(int i=1; i<n; i++) {
			dp[0][i] = i;
		}
		for(int i=1; i<m; i++) {
			dp[i][0] = i;
		}
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
				else dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1]));
			}
		}
		return dp[m][n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Min number of operation to make string equal");
		String str1 = "horse";
		String str2 = "ros";
		int ans = dp(str1,str2);
		System.out.println("Ans => "+ans);

	}

}
