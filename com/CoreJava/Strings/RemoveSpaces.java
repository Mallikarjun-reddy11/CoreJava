package com.CoreJava.Strings;

public class RemoveSpaces {
	public static void main(String[] args) {
String  name="Iam a java developer";
String res="";
for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch!=' ') {
		res+=ch;
//String res=name.replace(" " , "");
	}}	
System.out.println("Removed Spaces: "+res);
}}
