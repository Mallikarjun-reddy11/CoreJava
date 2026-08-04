package com.CoreJava.Strings;

public class Reverse {

	String s = "mom";

	public void reverseS() {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		if (s.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");

		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.reverseS();
	}
}
