/*
      *
     ***
    *****
   *******
  *********
 ***********
*************
 */
package com.amra.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int n = 7;
		int count = n - 1;
		
		for(int k = 1 ; k<=n ; k++){
			for(int j = 1 ; j <=count ; j++)
				System.out.print(" ");
				count--;
			for(int i = 1;i<= 2*k-1;i++)	
				System.out.print("*");
			System.out.println();
		}
		
	}

}
