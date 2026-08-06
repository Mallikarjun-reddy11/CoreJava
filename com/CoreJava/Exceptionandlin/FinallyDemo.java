package com.CoreJava.Exceptionandlin;

public class FinallyDemo {
public static void main(String[] args) {
try {
	int n=10/0;
}catch(ArithmeticException e) {
	e.printStackTrace();
	
}finally {
	System.out.println("Executed succesfully ");
}
}
}