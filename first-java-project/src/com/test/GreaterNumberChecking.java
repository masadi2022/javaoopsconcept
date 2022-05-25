package com.test;

public class GreaterNumberChecking {

	public static void main(String[] args) {
	
		int numOne=45,numTwo=98,numThree=34;
		
		if(numOne>0&&numTwo>0&&numThree>0) {
			
			if(numOne!=numTwo&&numTwo!=numThree&&numThree!=numOne) {
				
				if(numOne>numTwo&&numOne>numThree) 
				{
					
					System.out.println(numOne);
				}
				else if(numTwo>numThree)
				{
		
					System.out.println(numTwo);
				}
				else {
					System.out.println(numThree);
				}
			}
			else
			{
				System.out.println("Two or more numbers are equal!!");
			}
		}
		else
		{
			System.out.println("zero not allowed!!");
			
			}
		}

}

