package com.oops;

public class Overloading {
	
	public int sum(int x,int y)
	{
		return(x+y);
	}
	
	public int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	
	public double sum(double x,double y)
	{
		return(x+y);
	}
	
	public void sum(float x,float y)
	{
		System.out.println(x+y);
	}
	
		public static void main(String[]args) {
			Overloading overload=new Overloading();
			System.out.println(overload.sum(456789973, 856378738));
			System.out.println(overload.sum(45, 78, 56));
			System.out.println(overload.sum(23.23, 67.10));

		}
}


