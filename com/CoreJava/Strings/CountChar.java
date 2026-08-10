package com.CoreJava.Strings;

public class CountChar {
	String s = "malLikarjun";
	public void countJ(String s) {
		int count = 0;
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'L') {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		CountChar c = new CountChar();
		c.countJ("malLikarjun");
	}
}