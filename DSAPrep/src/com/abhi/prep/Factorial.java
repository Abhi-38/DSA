package com.abhi.prep;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int org = num;
		int fact = 1;
		
		while(num>0) {
			fact*=num;
			num--;
		}//while
		System.out.println("Factorial of "+org+" is: "+fact);
		sc.close();
	}//main
}//class
