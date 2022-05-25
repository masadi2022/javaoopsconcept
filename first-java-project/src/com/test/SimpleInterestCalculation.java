package com.test;

public class SimpleInterestCalculation 
{
	public static void main(String[]args)
	{
		double interestAmount,principleAmount,rateOfInterest,timeInYears;
		
		principleAmount=5000;
		rateOfInterest=5;
		timeInYears=3;
		
		{
			interestAmount=(principleAmount*rateOfInterest*timeInYears)/100;
			System.out.println("Amount="+interestAmount);
		}
		
	}

}
