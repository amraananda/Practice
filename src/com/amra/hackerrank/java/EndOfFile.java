package com.amra.hackerrank.java;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int lineNumber = 0;
		
		while(scan.hasNext()){
			lineNumber++;
			String s = scan.nextLine();
			System.out.println(lineNumber+" "+s);
		}
		scan.close();
	}
}
