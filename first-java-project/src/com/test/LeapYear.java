package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	
		public static void main(String[] args) throws NumberFormatException,IOException{
			
			int year;
			InputStreamReader r=new InputStreamReader(System.in); 
			BufferedReader br=new BufferedReader(r);
			 
			System.out.println("Enter the year:");
			year=Integer.parseInt(br.readLine());
			
			if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		         System.out.println("year is a leap year");
		      else
		         System.out.println("year is not a leap year");
	}
}