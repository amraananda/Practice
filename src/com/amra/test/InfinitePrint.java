package com.amra.test;

public class InfinitePrint {

	public static void main(String[] args) {

		callAmra();
		
	}

	private static void callAmra() {
		 System.out.println("Amra");
		 callAmra();
	}

}
