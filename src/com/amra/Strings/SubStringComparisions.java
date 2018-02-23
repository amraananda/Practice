package com.amra.Strings;

import java.util.Scanner;

public class SubStringComparisions {

	public static String getSmallestAndLargest(String s, int k) {
        String m,M;
        //m=M=s.substring(0, k);
        
        String smallest = "z";
        String largest = "a";
        
        for(int i =0 ; i <= s.length()-k; i++){
        	m=M=s.substring(i, i+k);
        	String subStr = s.substring(i, i+k);
        	if(subStr.matches("[a-zA-Z]+"))
        	{
        		//System.out.println(subStr);
        		//if(s.compareTo(subStr) <=0){
            		if(subStr.compareTo(smallest)<0 ){
        			smallest = subStr ;
            	}else if(subStr.compareTo(largest)>0){
            		//if(subStr.compareTo(largest)>0)
            		largest = subStr;
            	}
        	}

        }
        return   smallest +"-"+largest;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
