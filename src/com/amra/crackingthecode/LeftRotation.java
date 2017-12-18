package com.amra.crackingthecode;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] a = new int[n+1];
		for(int i=0 ; i<n; i++){
			a[i] = in.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(a));
		in.close();
		
		int[] result = new int[n];
		
		for(int i=0 ; i < n ;i++){
			//int[] temp = new int[n];
			if(i >=(n-1)){ 
				result[i] = a[i-(n-1)];
			}
			else{
				result[i] = a[i+n];
			}
		}
		
		System.out.println(Arrays.toString(result));
	}


}
