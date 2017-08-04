package com.amra.Scanner;

import java.util.Scanner;

public class ChangeJarBasic {

	public static void main(String[] args) {
		//Create the scanner
		Scanner scan = new Scanner(System.in);
		
		//Number of pennies
		System.out.println("Enter the number of pennies:");
		int numberOfPennies = scan.nextInt();
		
		//Number of nickels
		System.out.println("Enter the number of nickels:");
		int numberOfNickels = scan.nextInt();
		
		//Number of dimes
		System.out.println("Enter the number of dimes:");
		int numberOfDimes = scan.nextInt();
		
		//Number of quarters
		System.out.println("Enter the number of dimes:");
		int numberOfQuarters = scan.nextInt();
		
		//Close scanner
		scan.close();
		
		//Calculate the total
		int totalCents = numberOfPennies + numberOfNickels*5 + numberOfDimes*10 + numberOfQuarters*25;
		
		double dollarValue = totalCents/100.0;
		
		System.out.println("Total cents:"+totalCents);
		System.out.println("Total Dollar value in jar:"+dollarValue);
		
	}

}
