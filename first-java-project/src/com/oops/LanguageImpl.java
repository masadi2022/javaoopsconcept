package com.oops;

public class LanguageImpl implements Language {

	@Override
	public void responsive() {
		System.out.println("frontend must be responsive");
		
	}

	@Override
	public void connectToserver() {
		System.out.println("backend must be connect to server");

	}

	@Override
	public void writeCode() {
		System.out.println("language must help to write backend and frontend logic");
	}
	
	public static void main(String[]args) {
		LanguageImpl language=new LanguageImpl();
		language.connectToserver();
		language.responsive();
		language.writeCode();
		
	}
	

}