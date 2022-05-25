package com.oops;

public class Shape {

	public void printShape()
	{
		System.out.println("This is shape class print method");
	}

}
class Rectangle1 extends Shape
{
	public void printRectangle()
	{
		System.out.println("This is Rectangle class print method");
	}
}
class Circle1 extends Shape
{
	public void printCircle()
	{
		System.out.println("This is Circle class print method");
	}
}
class Square extends Rectangle1
{
	public void printSquare()
	{
		System.out.println("This is the Square class print method");
	}
}
