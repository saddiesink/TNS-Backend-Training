package com.tnsif.threaddemo;

public class RunnableMain {

	public static void main(String[] args) {
		 
		RunnableDemo t1=new RunnableDemo("task1");
		RunnableDemo t2=new RunnableDemo("task2");
		     Thread ob=new Thread(t1);
		      Thread ob1=new Thread(t2);
		     
		      ob.setPriority(10);
		      ob1.setPriority(1);
		     
		      ob.start();
		      ob1.start();
				
			}
	 

	}

 
