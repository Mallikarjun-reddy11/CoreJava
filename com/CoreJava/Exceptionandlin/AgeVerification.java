package com.CoreJava.Exceptionandlin;

public class AgeVerification {
	public static void main(String[] args) {
		int age = 0;
try {
	if(age<18) {
		System.out.println("Eligible");
	}else {
		System.out.println("not eligible");
	}
}catch(Exception e) {
	System.out.println(e.getMessage());
}
	}
}
