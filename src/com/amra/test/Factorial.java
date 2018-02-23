package com.amra.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(findFactorial(n));
	}

	private static int findFactorial(int n) {
		
		int f = 1;
		while(n!= 0 ){
			f = f*n ;
			n--;
		}
		return f;
	}

}
