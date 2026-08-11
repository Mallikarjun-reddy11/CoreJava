package com.CoreJava.Strings;

public class ReplaceString {
	public static void main(String[] args) {
		String name = "Mallikarjun";
		String res = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'l') {
				ch = 'r';
			}
			res += ch;
		}
		System.out.println("Replace of letters: "+res);
	}
}
