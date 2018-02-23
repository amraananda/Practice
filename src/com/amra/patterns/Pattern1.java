/*
********
*******
******
*****
****
***
**
*

 */
package com.amra.patterns;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 8;
		
		for(int row = 8 ; row > 0 ; row--){
			for(int col = 1 ; col <=row  ; col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
