/*Description:
Write a program to reverse a string using recursive methods.
You should not use any string reverse methods to do this.
*/
package com.amra.test;

import java.util.Scanner;

public class Reverse {

	public static String findReverseString(String str){
		//String s = null;
		int lenght = str.length();
		
		if((str==null)||(str.length() <= 1))
			return str;
		
		return str.substring(lenght - 1) + findReverseString(str.substring(0, lenght - 1));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//String s = "Test";
		String result =findReverseString(str);
		System.out.println(result);
	}
}
