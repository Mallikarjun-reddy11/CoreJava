package com.CoreJava.Strings;

public class RemovingNum {
public static void main(String[] args) {
	String name="Mallika123rjun";
	String res="";
	for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		if (!Character.isDigit(ch)) {
			res+=ch;
		}
	}
	System.out.println("Removed the numbers: "+res);
}
}
