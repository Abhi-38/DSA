package com.abhi.prep.arrays;

import java.util.Scanner;

public class MaxArrayElement {
	public static int result(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}//if
		}//for
		return ans;
	}//result
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt(); 
		}//for
		
		int result = result(arr);
		System.out.println("Max element is: "+result);
		sc.close();
	}//main
}//class
