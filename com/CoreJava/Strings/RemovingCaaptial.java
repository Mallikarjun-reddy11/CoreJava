package com.CoreJava.Strings;

public class RemovingCaaptial {
	public static void main(String[] args) {
		String name = "MAllIkArjuN";
		String res = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
//			if (!Character.isUpperCase(ch)) {
//				res += ch;
			if(ch>='a'&&ch<='z') {
				res+=ch;
			}
		}
		System.out.println("Removing capital letters: " + res);
	}
}
