package com.CoreJava.Strings;

public class BinaryConversion {
	public static void main(String[] args) {
		int n = 50;
		String res = "";
		while (n != 0) {
			int rem = n % 2;
			res = rem + res;
			n = n / 2;
		}
		System.out.println(res);
	}
}
