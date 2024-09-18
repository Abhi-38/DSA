package com.abhi.prep.thread;

public class Mythread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}//for
	}//run
	
}//class
