package com.abhi.prep;

import java.util.Scanner;

public class SumOfDigitsInNumber {
	public static void main(String[] args) {
		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int org_num = num;
		int sum = 0;
		//int rem = 0;
		while(num>0) {
			sum += num%10;
			num = num/10;
			//sum = sum + rem;
		}//while
		
		System.out.println("Sum of digits in "+org_num+" is: "+sum);
		sc.close();
	}//main
}//class
