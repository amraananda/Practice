/*You have got a range of numbers between 1 to N, where one of the number is
repeated. You need to write a program to find out the duplicate number.
*/

package com.amra.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicate {

	public int findDuplicateNumber(List<Integer> numbers) {
		int duplicate = 0;
		int higestNum = numbers.size() - 1;
		int sum = getSum(numbers);
		duplicate = sum - (higestNum * (higestNum + 1)/2);
		return duplicate;
	}
		public int getSum(List<Integer> numbers) {
			int sum = 0;
			for(int num:numbers){
				sum += num;
			}
			return sum;
		} 
		public static void main(String a[]){
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=1; i<=30;i++){
			nums.add(i);
		}
		nums.add(22);
		//Collections.sort(nums);
		Duplicate dn = new Duplicate();
		System.out.println("The duplicate number is:"+ dn.findDuplicateNumber(nums));
	}
}
