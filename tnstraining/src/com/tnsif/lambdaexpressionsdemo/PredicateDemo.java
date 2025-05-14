package com.tnsif.lambdaexpressionsdemo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p=str->str.length()>5;
		System.out.println(p.test("varnitha"));
		System.out.println(p.test("var"));

	}

}
