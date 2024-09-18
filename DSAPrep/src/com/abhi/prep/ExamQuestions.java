package com.abhi.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamQuestions {

	public static ArrayList<ArrayList<Integer>> theOrder(int t, List<Integer> testCases) {
		ArrayList<ArrayList<Integer>> allOrders = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int n = testCases.get(i);
			ArrayList<Integer> questions = new ArrayList<>();

			for (int j = 1; j <= n; j++) {
				questions.add(j);
			}//for

			ArrayList<Integer> order = new ArrayList<>();
			int index = 1; // Start solving from the 2nd index (0-based)

			while (!questions.isEmpty()) {
				order.add(questions.remove(index));

				if (questions.isEmpty()) {
					break;
				}//if

				index = (index + 1) % questions.size();
			}//while

			allOrders.add(order);
		}//for

		return allOrders;
	}//theOrder

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // Number of test cases
		List<Integer> testCases = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			testCases.add(sc.nextInt());
		}//for

		ArrayList<ArrayList<Integer>> results = theOrder(t, testCases);

		for (ArrayList<Integer> order : results) {
			for (int j = 0; j < order.size(); j++) {
				if (j != 0) {
					System.out.print(" ");
				}//if
				System.out.print(order.get(j));
			}//for
			System.out.println();
		}//for

		sc.close();
	}//main
}//class
