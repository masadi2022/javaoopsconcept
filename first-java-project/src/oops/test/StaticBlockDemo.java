package oops.test;

public class StaticBlockDemo {

	int a=10;
	static int b=10;
	
	 void display1()
	{
		System.out.println("This is a demo");
	}
	
	static void display()
	{
		System.out.println("this is demo method");
	}
	static
	{
		display();
		System.out.println(b);
		System.out.println("This is a static block!!");
	}
	
	public static void main(String args[])
	{
		System.out.println("This is the main method");
	}
}
