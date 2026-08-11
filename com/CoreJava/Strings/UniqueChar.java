package com.CoreJava.Strings;

public class UniqueChar {
	public static void main(String[] args) {
		String str = "jaaaavaajaavaa";
		String unique = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (unique.indexOf(ch) == -1) {
				unique += ch;

			}
		}
		System.out.println(unique);
	}
}
