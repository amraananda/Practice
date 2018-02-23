package com.amra.Strings;

import java.util.Scanner;


public class StringFirst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(sumofStrings(A,B));
        lexicographicallyLarger(A,B);
        captialize(A,B);
        sc.close();
	}

	public static int sumofStrings(String a, String b) {
		// TODO Auto-generated method stub
		int sum =0;
		int aLength = a.length();
		int bLenght = b.length();
		sum = aLength + bLenght;
		return sum;
	}

	public static void lexicographicallyLarger(String a, String b) {
		int c = a.compareToIgnoreCase(b);
		if(c > 0 ){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	private static void captialize(String a, String b) {
		String s = null;
		String s1 = a.substring(0,1).toUpperCase()+a.substring(1);
		String s2 = b.substring(0,1).toUpperCase()+b.substring(1);
		s = s1+" "+s2;
		System.out.println(s);
	}
}
