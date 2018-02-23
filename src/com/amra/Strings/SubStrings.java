package com.amra.Strings;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		
		String sub = str.substring(start, end);
		System.out.println(sub); 
	}

}
