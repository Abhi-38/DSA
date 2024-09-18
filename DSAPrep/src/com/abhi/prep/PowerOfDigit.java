package com.abhi.prep;

import java.util.Scanner;

public class PowerOfDigit {
	public static void main(String[] args) {
		//take input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		int org = num;
		int ans = 1;
		for(int i=1; i<=power; i++) {
			//num = num*i;
			ans = ans*num;
		}//for
		System.out.println("Power of "+org+" is: "+ans);
		sc.close();
	}//main
}//class
