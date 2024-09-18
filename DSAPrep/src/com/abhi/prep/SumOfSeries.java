package com.abhi.prep;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		//taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int ans = 0;
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				ans-=i;
			}//if
			else {
				ans+=i;
			}//else
		}//for
		
		System.out.println("Sum of the series is: "+ans);
		sc.close();
	}//main
}//class
