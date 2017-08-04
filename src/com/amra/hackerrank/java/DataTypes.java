package com.amra.hackerrank.java;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=0 ; i<t ;i++){
			
			try{
				long x = input.nextLong();
				System.out.println(x + "can be fitted in:");
				if(x>=-128 && x<=127)
					System.out.println("* byte");
				if(x>=-Short.MIN_VALUE && x<=Short.MAX_VALUE)
					System.out.println("* short");
				if(x>=-(Math.pow(2,31)) && x<=((Math.pow(2,31))-1))
					System.out.println("* int");
				if(x>=-(Math.pow(2,63)) && x<=((Math.pow(2,63))-1))
					System.out.println("* long");
			}
			catch(Exception e){
				System.out.println(input.next()+"can't be fitted anywhere.");
			}
		}
		input.close();
	}
}
