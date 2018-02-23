/*
 GIven an unsorted Arrya of n elements,find if the element k is present in the array or not
 The two input parameters are 
 1.An array of integers,arr ,denoting the elements in the array
 2.An integer k ,denoting the element to be searched in the array
 
 Input format:
 The first line contains an integer n ,denoting the number of elements in the arr
 Each line i of the n subsequent lines(where 0<=i<=n) contains an integer describio\ng arr(i)
 The next line contains an integer k, the element that needs to be serched
 
 Constraints
 1<=n<=10^5
 1<=arr[i]<=10^5
 
 Output Format:
 The function returns a streing "YES" or "NO"
 
 Sample Input:
 3
 2
 3
 1
 5
 
 Sample Output:
 NO
 */

package com.amra.test;

import java.util.Scanner;

public class ArrayElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0 ; i<n;i++){
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		
		ArrayElement result = new ArrayElement();
		System.out.println(result.findNumber(arr,k));
	}

	String findNumber(int[] arr, int k){
		String result = null;
		for(int n:arr){
			if (n == k){
				result = "YES";
			}
			else 
				result = "NO";
		}
		return result;
	}
}
