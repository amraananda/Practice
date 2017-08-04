package com.amra.hackerrank.java;

public class StaticExample {
 
	static {
        System.out.println("This is first static block");
    }
	
	StaticExample(){
		System.out.println("This is a constructor");
	}
	public static String staticString = "Static Variable";

    static {
        System.out.println("This is second static block and "
		                                        + staticString);
    }
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		StaticExample statEx = new StaticExample();
		StaticExample.staticMethod2();
		
	}
	static{ 
		staticMethod1();
		System.out.println("This is third static block");
	}
	public static void staticMethod1(){
		System.out.println("This is static Method1");
	}
	public static void staticMethod2(){
		System.out.println("This is static Method2");
	}

}
