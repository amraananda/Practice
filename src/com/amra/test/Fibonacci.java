package com.amra.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers you want in teh sequence:");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println("The series is:");
		
		int n1= 0 ,n2=1;
		for (int i = 1 ; i <= num ; i++){
			System.out.println(n1);
			
			int nextnum = n1+n2;
			n1 = n2 ;
			n2 = nextnum ;
		}
	}

}
