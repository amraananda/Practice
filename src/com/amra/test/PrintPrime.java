package com.amra.test;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		
		System.out.println("Enter the number till which prime number to be printed: ");
		Scanner in =  new Scanner(System.in);
                	int limit = in.nextInt();
                	for(int i = 2;i<=limit;i++){
                		if(isPrime(i));
                		System.out.println(i);
                	}
	}

	private static boolean isPrime(int n) {
		//for(int i =2;i<n;i++){
			if(n%2==0){
				return false;
			}
			for(int i = 3 ;i<Math.sqrt(n); i+=2){
				if(n%i == 0)
					return false;
			}		
			return true;
	}

}
