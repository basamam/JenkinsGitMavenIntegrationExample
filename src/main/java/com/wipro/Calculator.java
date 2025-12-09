package com.wipro;

public class Calculator {
	
	public static int addition(int num1,int num2) {
		System.out.println("Addition method from Calculator class");
		return num1+num2;
	}
	
	public static int subtraction(int num1,int num2) {
		return num1-num2;
	}
	
	public static int multiplication(int num1,int num2) {
		return num1*num2;
	}
	public static int division(int num1,int num2) {
		return num1/num2;
	}
	
	public static long findFactorial(int num) {
		if(num<=0)
			return 1L;
		else
			return num*findFactorial(num-1);
	}

}
