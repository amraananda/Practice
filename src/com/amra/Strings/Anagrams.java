package com.amra.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	private static boolean isAnagram(String a, String b) {
		boolean result = false;
		
		if(a.length() != b.length())
			return result;
		int n = a.length();
		char[] a1 = a.toLowerCase().toCharArray();
		char[] b1 = new char[n];
		
		for(int i = 0 ; i < n;i++){
			b1[i] = b.charAt(i);
		}
		Arrays.sort(a1);
		Arrays.sort(b1);
//		
//		if(Arrays.equals(a1, b1))
//			return true;
//		else
//		return result;
		
		String c = new String(a1);
		String d = new String(b1);
		
		if(c.equals(d))
			return true;
		else
			return result;
	}

}
