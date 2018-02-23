package com.amra.hackerrank.java;

import java.util.Scanner;

public class DivisorsSUm {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(divisor_sum(n));
      	sc.close();
	}

	private static int divisor_sum(int n) {
		int[] div = new int[n];
        int dSum = 0;
        for(int i = 1;i<=n ;i++){
            if(n%i == 0)
              dSum = dSum + i; 
        }
        return dSum;
	}

}
