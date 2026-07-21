package Loops;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int tem=n;
	int rev=0;
	while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==tem) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
