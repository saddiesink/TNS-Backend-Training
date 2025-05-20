package com.tnsif.lambdaexpressionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamOperations {

	 

	public static void main(String[] args) {
		
		//this is via customed class
	 List<Employee> l=new ArrayList<Employee>();
	 l.add(new Employee(719,"Anya",46000f));
	 l.add(new Employee(723,"mitsuha",67893.867f));
	 l.add(new Employee(756,"loid",35875.78f));
	 l.add(new Employee(745,"chandana",76854.576f));
	 l.add(new Employee(768,"mohan",86950.67f));
	 l.add(new Employee(767,"tharun",98656.67f));
	 //filter data based on salary
	 Stream<Employee> st=l.stream().filter(sal->sal.esal>50000.00f);
	 st.forEach(n->System.out.println("Eid "+n.empid+"Ename "+n.ename+
			 "Esal "+n.esal));
	 
	 
	 //MAP (retrieve the names of employee in upper case)
	 String[] str= {"harshi","chandu","bhanu","rakshi"};
	 //using array structure,asList is a static method
	 List<String> name=Arrays.asList("raghav","ram","sri","Latha");
	 
	 name.stream().map(String::toUpperCase)
	 //::reference
	 //String s=new String();in string we will write like this
	 //s.toUpperCase();
	 
	 .forEach(System.out::println);
	 
	 
	 //performing sorting operation using 2 lines
	 List<String> names=Arrays.asList("raghav","ram","sri","Latha");
	 names.stream().sorted().forEach(System.out::println);
	 
	 //map+soring both operations in one line
	 names.stream().sorted().map(String::toUpperCase).
	 forEach(System.out::println);
	 
	 System.out.println("reduce operations");
	 List<Integer> number=Arrays.asList(10,20,50,67,45);
	 
	 //BiFunction<T,V,R>-> t is one value  , v is 2 value ,r is result of 
	 //t and u
	 //sum is the reference and it is performing addition operation
	 
	 int sum=number.stream().reduce(0,Integer::sum);
	 System.out.println(sum);
	 
	 
	 
	 

	}

}
