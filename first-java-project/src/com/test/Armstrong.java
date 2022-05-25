package com.test;

import java.io.StringReader;

public class Armstrong {

	public static void main(StringReader[]args) {
		
		int Num=153,OriginalNum,Remainder;
		double Result=0;
		
		OriginalNum = Num;
		while(OriginalNum!=0) {
			Remainder=OriginalNum% 10;
			Result +=Math.pow(Remainder, 3);
			OriginalNum/=10;
		}
			if(Result==Num)
				System.out.println(Num+"is an Armstrong number.");
			else
				System.out.println(Num+"is not an Armstrong number.");
		
	}

}
