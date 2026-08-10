package com.CoreJava.Strings;

public class Count {
public static void main(String[] args) {
	String name="malLikarjun";
	int count=0;
	name=name.toUpperCase();
	for (int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		if(ch =='L') {
		
			count ++;
		}
	}
	System.out.println(count);
}
}
