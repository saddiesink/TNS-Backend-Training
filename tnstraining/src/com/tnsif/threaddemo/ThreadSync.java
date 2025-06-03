package com.tnsif.threaddemo;

public class ThreadSync {
synchronized public static void add(int n) throws InterruptedException {
		
		for(int i=0;i<4;i++) {
			System.out.println(n+i);
			Thread.sleep(1000);
		}
		
	}
	
}

 
