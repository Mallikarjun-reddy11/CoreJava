package com.CoreJava.Strings;

public class ReverseString {
public static void main(String[] args) {
	String name="Mallikarjun";
	char  arr[]=name.toCharArray();
	int start=0;
	int end=arr.length-1;
	for (int i=0;i<name.length()-1;i++) {
		char ch=name.charAt(i);
		if(start<end) {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}
	System.out.println(arr);
}
}
