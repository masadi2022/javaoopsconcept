package com.oops;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main method with string array as an argument");
		main("Hello");

	}
	
	public static void main(String args)
	{
		System.out.println("Main method with string object as an argument");
		main("Hi","programmer");
	}
	
	public static void main(String args1,String args2)
	{
		System.out.println("Main method with two string object as argument");
	}

}
