package com.amra.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		boolean result = checkPalindrome(num);
		System.out.println(result);
	}

	public static boolean checkPalindrome(int num) {
		
		boolean isPalindrome = false;
		if(num == reverse(num))
			return true;
		return isPalindrome;
	}

	public static int reverse(int num) {
		int rev = 0;
		while(num != 0 ){
			rev = rev * 10 + num % 10 ;
			num = num/10;
		}
		return rev;
	}

}
