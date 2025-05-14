package com.tnsif.generic;

public class SenderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender<String> ob=new Sender<String>();
		ob.setMessage("hello varnitha");
		System.out.println(ob.getMessage());
		//why use generics??
		//code reusability is happening
		//generics are used for type safety , can eliminate type casting 
		//Def:generics in java allows you to write flexible reusable code by classes 
		//,interfaces and methods and it also provides compile time type checking
		Sender<Integer> o=new Sender<Integer>();
		o.setMessage(129);
		System.out.println(o.getMessage());


	}

}
