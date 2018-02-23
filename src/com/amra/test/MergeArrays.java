package com.amra.test;

import java.util.Scanner;

public class MergeArrays {

public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	String firstStr = scan.nextLine();
	String secStr = scan.nextLine();
	
	System.out.println(mergeString(firstStr,secStr));
	
}

public static String mergeString(String firstStr, String secStr ){
	StringBuffer sb = new StringBuffer();
	
	int diff=firstStr.length()-secStr.length();
	
	int firstInd=0;
	int secInd=0;

	if(diff==0) {
		
		for(int i=0;i<(2*firstStr.length());i++) {
			if(i%2==0) {
				sb.append(firstStr.charAt(firstInd));
				firstInd++;
			}else {
				sb.append(secStr.charAt(secInd));
				secInd++;
			}
		}
	}else if(diff>0) {
		for(int i=0;i<2*secStr.length();i++) {
			if(i%2==0) {
				sb.append(firstStr.charAt(firstInd));
				firstInd++;
			}else {
				sb.append(secStr.charAt(secInd));
				secInd++;
			}
		}
		if(diff!=firstStr.length()-1)
		sb.append(firstStr.substring(diff, firstStr.length()-1));
		else
			sb.append(firstStr.charAt(diff));
	}else {
		for(int i=0;i<2*firstStr.length();i++) {
			if(i%2==0) {
				sb.append(firstStr.charAt(firstInd));
				firstInd++;
			}else {
				sb.append(secStr.charAt(secInd));
				secInd++;
			}
		}
		if(diff!=secStr.length()-1)
		sb.append(secStr.substring((-1*diff), secStr.length()-1));
		else
			sb.append(firstStr.charAt(diff));
				
	}
	return sb.toString();
}

}
