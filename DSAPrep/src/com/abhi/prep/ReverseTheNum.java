package com.abhi.prep;

import java.util.Scanner;

public class ReverseTheNum {
	public static void main(String[] args) {
		//taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int org = num;
		//int rem = 0;
		int rev = 0;
		while(num>0) {
			//rem = num % 10;
			//rev = rev * 10 + rem;
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}//while
		System.out.println("Reverse of "+org+" is: "+rev);
		sc.close();
	}//main
}//class
