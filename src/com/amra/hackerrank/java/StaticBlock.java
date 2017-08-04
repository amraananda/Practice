package com.amra.hackerrank.java;

import java.util.Scanner;

public class StaticBlock {
    
	public static boolean flag = true;
	public static int B;
	public static int H;
	
	static{
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		scan.close();
		if(B<=0 || H<=0){
			flag= false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
