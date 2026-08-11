package com.CoreJava.Strings;

public class RemovingSmall {
	public static void main(String[] args) {
		String name = "MaLLIkarjuN";
		String res = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
//			if (!Character.isLowerCase(ch)) {
//				res += ch;
			if(ch>='A'&&ch<='Z') {
				res+=ch;
			}
		}
		System.out.println("Removing Small letters: " + res);
	}
}
