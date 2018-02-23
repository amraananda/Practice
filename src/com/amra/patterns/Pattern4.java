/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
package com.amra.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n = 5 ;
		int count = n-1;
		
		for(int k = 1 ; k <=2*n-1 ;k++){
			for(int j =1 ; j <=count;j++)
				System.out.print(" ");
			count--;
			for(int i = 1;i<= 2*k-1;i++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		count = 1;
		for(int k = 1; k <=n-1;k++){
			for(int j = 1;j<=count ;j++)
				System.out.print(" ");
			count++;
			for(int i = 1;i<2*(n-k)-1;i++)
				System.out.print("*");
			System.out.println();
		}
	}

}
