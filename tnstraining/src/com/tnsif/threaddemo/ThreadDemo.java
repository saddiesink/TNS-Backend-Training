package com.tnsif.threaddemo;

public class ThreadDemo extends Thread{
	 
		
		public void run() {
			for(int i=0;i<4;i++) {
				System.out.println(Thread.currentThread());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


