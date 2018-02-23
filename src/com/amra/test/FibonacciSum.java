package com.amra.test;

import java.util.Scanner;

public class FibonacciSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers you want in teh sequence:");
		int num = scan.nextInt();
		scan.close();
		
		int result = fibSum(num);
		
		int sum = 0;
		int[] inputarr; 
		for(int i = 0 ; i <= num ;i++){
			
		}
		System.out.println("The sume of the series is :"+result);
		
	}

	private static int fibSum(int num) {
		int a = 0, b = 1 ;
		int c;
		
		if(num == 0)
			return a;
		
		for(int i = 2 ; i <= num ;i++){
			c = a+b;
			System.out.println("a"+a+"b"+b+"c"+c);
			a = b;
			b = c;
			c++;
		}
		return b;
	}

}
