package com.abhi.prep.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();  //running the thread
		//t.run();
		
		for(int i=0;i<5;i++) {
			System.out.println("main method");
		}//for
		
	}//main
}//class
