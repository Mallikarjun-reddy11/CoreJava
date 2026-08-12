package com.CoreJava.Strings;

public class RemoveVowels {

	public static void main(String[] args) {
		String name = "Mallikarjun";
		String res = "";
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				res += ch;
			}
		}
		System.out.println(res);
	}

}
