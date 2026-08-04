package com.CoreJava.Strings;

public class CountVowels {
	String s = "Mallikarjun";

	public void countV() {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		CountVowels c = new CountVowels();
		c.countV();
	}
}
