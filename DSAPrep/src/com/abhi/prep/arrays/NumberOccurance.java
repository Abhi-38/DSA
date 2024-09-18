package com.abhi.prep.arrays;

import java.util.Scanner;

public class NumberOccurance {
	public static int result(int[] arr, int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				count++;
			}//if
		}//for
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Element to find: ");
		int x = sc.nextInt();
		int ans = result(arr, x);
		System.out.println("number of occurances: "+ans);
		sc.close();
	}
}
