package com.tnsif.generic;
//Demo for applying generic on a method

public class GenricMethodDemo {
	//T (type) is representing object
	public static <T> void displayArray(T[]array) {
		//to define object we are going with generic
		//for(return type varname:arrayname
		for(T i:array) {
			System.out.println("array elements "+i);
			
		}
		
	}
}


