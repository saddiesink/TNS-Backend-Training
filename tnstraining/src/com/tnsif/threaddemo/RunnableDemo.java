package com.tnsif.threaddemo;
//demo for runnable interface


 public class RunnableDemo implements Runnable {
	String name;
	public RunnableDemo(String name) {
		this.name=name;
	}
	@Override
	public void run() {
     for(int i=0;i<5;i++) {
   	  System.out.println("The current thread"+name);
   	  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
     }	
	}
}


 
