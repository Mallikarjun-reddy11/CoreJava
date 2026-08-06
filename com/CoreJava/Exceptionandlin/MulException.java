package com.CoreJava.Exceptionandlin;

public class MulException {
public static void main(String[] args) {
	int arr[]=new int[5];
	try {
		int a=9;
		int b=0;
		int result=a/b;
		arr[5]=result;
	}catch(ArithmeticException e) {
	      System.out.println("ArithmeticException: Cannot divide by zero.");
	}catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
	}
	
}
}
