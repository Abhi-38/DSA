package com.abhi.prep.arrays;

import java.util.Scanner;

public class StrictlyGreatNumbers {
	public static int number(int[] arr, int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
			}//if
		}//for
		return count;
	}//number
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element: ");
		int x = sc.nextInt();
		
		int ans = number(arr, x);
		
		System.out.println("numbers greater than aare: "+ans);
		sc.close();
	}//main
}//class
