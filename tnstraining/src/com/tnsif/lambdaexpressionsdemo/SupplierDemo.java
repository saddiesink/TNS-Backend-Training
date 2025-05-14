package com.tnsif.lambdaexpressionsdemo;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String args[]) {
		
		Supplier<Double> sup=()->Math.random();
		//get is a method that should be enclosed with parantheses 
		System.out.println(sup.get());
	}

}
