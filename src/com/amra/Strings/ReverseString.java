package com.amra.Strings;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Hello";
		String result =reverse(input);
		System.out.println(result);
	}

	public static String reverse(String input) {
		
		if(input == null || input.isEmpty()){
			return input;
		}
		
		String str = "";
		int lenght = input.length();
		for(int i = lenght - 1 ; i>=0 ;i--){
			str = str + input.charAt(i);
		}
		return str;
	}

}
