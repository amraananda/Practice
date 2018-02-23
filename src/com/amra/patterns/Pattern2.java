/*
 
*
**
***
****
*****
******
*******
********
  
 */
package com.amra.patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 0;
		for(int row = 1 ; row <= 8 ; row++){
			for(int col=1 ; col <=row ; col++){
				System.out.print(++n+" ");
			}
			System.out.println();
		}
	}

}
