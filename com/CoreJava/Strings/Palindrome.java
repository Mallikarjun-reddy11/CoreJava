package com.CoreJava.Strings;

public class Palindrome {
	public static void main(String[] args) {
		String name = "madam";
		char arr[] = name.toCharArray();
		int start = 0;
		int end = name.length() - 1;
		for (int i = 0; i < name.length() - 1; i++) {
			if (start < end) {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(arr);
		String result = new String(arr);
		if (name.equals(result)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}
}
