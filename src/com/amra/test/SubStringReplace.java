package com.amra.test;

import java.util.Scanner;

public class SubStringReplace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String sub = in.next();
		
		in.close();
		
		String resultStr = removeSubString(str,sub);
		System.out.println(resultStr);
	}

	public static String removeSubString(String str, String sub) {
/*
		String result = " ";
		String[] s = str.split(sub);
		//System.out.println(s);
		result = s[0] + s[1].toString();
		System.out.println(result);
		return result;
	*/
		int i = str.indexOf(sub);
		System.out.println(i);
	
		//String regex = "[ch+]";
		String[] s = str.split(sub);
		//System.out.println(s);
		String result = s.toString();
		System.out.println(result);
		return result; 
	
	}

}
