package com.amra.test;

import java.util.Scanner;

public class OddNumbers {
	
	 static int findTheOddNumbers(int l,int r){
		
		int num = 0;
		for (int i = l;i<=r ; i++){
			if (i %2 !=0){
				num = i;
				System.out.print(num + " ");
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		
		OddNumbers od = new OddNumbers();
		od.findTheOddNumbers(l,r);
		//System.out.println(result);
	}


}
