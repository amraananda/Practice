package com.amra.hackerrank.java;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Amra
 *
 */
public class DateTime {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		String day = scan.next();
		String year = scan.next();
		scan.close();
		

		System.out.println(getDayForDate(month,day,year));
		
	}
	public static String getDayForDate(String month,String day,String year){
		int nmonth = Integer.parseInt(month);
		int nday = Integer.parseInt(day);
		int nyear = Integer.parseInt(year);
		Calendar calender  = Calendar.getInstance();
		
		calender.set(Calendar.YEAR, nyear);
		
		
		calender.set(Calendar.MONTH, nmonth-1);
		calender.set(Calendar.DAY_OF_MONTH, nday);
		
		int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);
		String[] days = {"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
		return(days[dayOfWeek-1]);
		
	
	}
}
