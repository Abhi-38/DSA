package com.abhi.prep;

import java.io.IOException;
import java.util.Scanner;

public class OptimalStrategyOfGame {
	public static int optimalStrategyOfGame(int[] coins, int n) {
        int[][] dp = new int[n][n];

        //fill the dp table for the intervals of length 1
        for(int i=0;i<n;i++){
            dp[i][i] = coins[i];
        }//for

        //fill the dp table for intervals greater than length 1
        for(int length = 2;length <= n;length++){
            for(int i = 0; i <= n - length; i++){
                int j = i + length - 1;

                int pickFirst = coins[i] + Math.min((i+2 <= j) ? dp[i+2][j] : 0,
                                                    (i+1 <= j-1) ? dp[i+1][j-1] : 0);
                int pickLast = coins[j] + Math.min((i <= j-2) ? dp[i][j-2] : 0,
                                                    (i+1 <= j-1) ? dp[i+1][j-1] : 0);                                    
                dp[i][j] = Math.max(pickFirst, pickLast);                                    
            }//for
        }//for
        //the result for whole range from 0 to n-1
        return dp[0][n-1];

    }//optimalStrategyOfGame
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++) {
			int N = sc.nextInt(); //number of coins
			int coins[] = new int[N];
			for (int i = 0; i < N; i++) {
				coins[i] = sc.nextInt(); // Coin values
			}//for
			// Call the function and print the result
            System.out.println(optimalStrategyOfGame(coins, N));
		}//for
		
		sc.close();
	}
}//class
