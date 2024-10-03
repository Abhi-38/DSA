package com.abhi.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchingWords {
	public static ArrayList<Integer> searchWords(String booklet, String[] diary) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Iterate through each word in the diary
        for (String word : diary) {
            int index = booklet.indexOf(word);
            
            // While the word exists in the booklet
            while (index != -1) {
                result.add(index); // Add the starting index
                // Find the next occurrence
                index = booklet.indexOf(word, index + 1);
            }
        }
        
        // Sort the result before returning
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        sc.nextLine();  // Consume the newline after the integer input
        
        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            String booklet = sc.nextLine();  // Input booklet string
            int numWords = sc.nextInt();  // Number of words in diary
            sc.nextLine();  // Consume the newline after the integer input
            String[] diary = sc.nextLine().split(" ");  // Diary words
            
            // Call the function and get the result
            ArrayList<Integer> indices = searchWords(booklet, diary);
            
            // Print the result
            for (int index : indices) {
                System.out.print(index + " ");
            }
            System.out.println();  // New line after each test case output
        }
        sc.close();
    }//main
}//class
