package com.test;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int numOne=10,numTwo=30;
		
		if(numOne>0&&numOne==10)
		{
			System.out.println("numOne is positive and equal 10");
		}
		if(numTwo>0 || numTwo>numOne)
		{
			System.out.println("numTwo is greater than numOne");
		}

	}

}
