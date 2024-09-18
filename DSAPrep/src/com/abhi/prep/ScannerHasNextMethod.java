package com.abhi.prep;

import java.util.Scanner;

public class ScannerHasNextMethod {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			/*
			 * Scanner sc = new Scanner(System.in); sc.hasNext(); String line1 =
			 * sc.nextLine(); sc.hasNext(); String line2 = sc.nextLine(); sc.hasNext();
			 * String line3 = sc.nextLine(); System.out.println("1 "+line1);
			 * System.out.println("2 "+line2); System.out.println("3 "+line3); sc.close();
			 */
		 Scanner scanner = new Scanner(System.in);
		 int lineNumber = 1;

         // Read until end of file (EOF)
         while (scanner.hasNext()) {
             String line = scanner.nextLine();
             System.out.println(lineNumber + " " + line);
             lineNumber++;
         }
         
         scanner.close();
	    }//main
}//class
