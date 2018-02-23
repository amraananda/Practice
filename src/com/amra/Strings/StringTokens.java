package com.amra.Strings;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        String regex ="[\\s !,?._'@]+";
			String[] s1 = s.replaceAll("^\\W+", "").split(regex);
			//System.out.println(s1);
			int length = s1.length;
			System.out.println(length);
			for(int i =0 ;i< length; i++){
				System.out.println(s1[i]);
			}
	}

}
