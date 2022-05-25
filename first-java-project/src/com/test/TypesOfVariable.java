package com.test;

public class TypesOfVariable {

	static int firstNumber=10;//static variable 
	
	public void print()
	{
		int secondNumber=10;//local variable
		System.out.println("Local variable value="+secondNumber);
		
	}
	public static void main(String args[])
	{
		int thirdNumber=30;//instance variable
		System.out.println("Instance variable value="+thirdNumber);
		System.out.println("Static variable value="+TypesOfVariable.firstNumber);
		
		TypesOfVariable ob=new TypesOfVariable();
		ob.print();
	}
 
}

