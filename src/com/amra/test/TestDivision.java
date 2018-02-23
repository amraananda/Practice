package com.amra.test;

public class TestDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b=0;
		int c  = divide(a,b);
		System.out.println(c);
	}
	public static int divide(int a, int b){
		int c = -1;
		try{
			c = a/b;
			
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		finally{
			System.err.println("Finally");
		}
		return c;
	}
}
