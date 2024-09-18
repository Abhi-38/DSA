package com.abhi.prep.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestOfArray {
	public static int[] smallestLargest(int[] arr) {
		Arrays.sort(arr);
		int result[] = {arr[0],arr[arr.length-1]};
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}//for
		System.out.print("Result: ");
		int[] ans = smallestLargest(arr);
		for(int result: ans) {
			System.out.println(result);
		}
		sc.close();
		//int ans = number(arr, x);
	}//main
}//claass
