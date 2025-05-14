package com.tnsif.lambdaexpressionsdemo;
//Demo for lambda expressions user defined functional interface
@FunctionalInterface
interface MathCal{
	int cal(int a,int b);
}

public class MathOperations {

	public static void main(String[] args) {
		//(parameters)->{statements};
		//reference for the functional interface
		MathCal add=(a,b)->a+b;
		MathCal mul=(a,b)->a*b;
		//reference
		System.out.println(add.cal(19,23));
		System.out.println(mul.cal(23, 19));		 

	}

}
