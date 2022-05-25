package com.test;

public class ErrorDetect {
	
	public static void main(String[]args) {
		
		double volumeIndication,volumeFlow,errorD;
		
		volumeIndication=0.012;
		
		volumeFlow=6;
		
		errorD=((volumeIndication-volumeFlow)/volumeFlow)*100;
		
		System.out.println("Error Detection in meter cube per hour"+errorD);
		
		
	}

}
