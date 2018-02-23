package com.amra.test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int count =0 ;
		
		for(int i = 2 ;i<n ; i++){
			if(n%i ==0){
				count++;
				break;
			}
		}
		if(count == 0)
			System.out.println("The number is prime");
		else
			System.out.println("Not a prime");
	}

}
