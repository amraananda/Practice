package com.amra.Strings;

import java.util.Scanner;

public class SubStringComparisions {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for(int i =0 ; i <= s.length()-k; i++){
        	String subStr = s.substring(i, i+k);
        	if(subStr.matches("[a-zA-Z]+"))
        	{
        		//System.out.println(subStr);
        		if(s.compareTo(subStr) < 0){
            		smallest = subStr ;
            	}else if(s.compareTo(subStr) > 0){
            		largest = subStr;
            	}
        	}
//        	if(s.compareTo(subStr)<0){
//        		smallest = subStr ;
//        	}else if(s.compareTo(subStr) > 0){
//        		largest = subStr;
//        	}
        }
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
