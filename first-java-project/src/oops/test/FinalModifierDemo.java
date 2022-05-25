package oops.test;

public class FinalModifierDemo {
	
	final int x=50;
	final double pi=3.14;
	
	public static void main(String args[]) {
		FinalModifierDemo ob=new FinalModifierDemo();
		
		//ob.x=60;
		//ob.Pi=3.50;
		System.out.println(ob.x);
		System.out.println(ob.pi);
		
	}

}
