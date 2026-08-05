package com.CoreJava.Strings;

public class UniqueChar {
public static void main(String[] args) {
	String str="javajavajavajava";
	String res="";

	for (int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(res.indexOf(ch)==-1) {
			res=res+ch;
			
		}
	}
	System.out.println(res);
}
}
