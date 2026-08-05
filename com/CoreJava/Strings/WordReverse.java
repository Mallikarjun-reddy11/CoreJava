package com.CoreJava.Strings;

public class WordReverse {
	public static void main(String[] args) {
	String str="I am java developer";
	String rev="";
	String arr[]=str.split("");
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+arr+"";
		
	}
	
	System.out.println(rev);
	}
}
