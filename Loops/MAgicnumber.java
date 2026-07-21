package Loops;

import java.util.Scanner;

public class MAgicnumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	while(n>9) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		n=sum;
	}
	if(n==1) {
		System.out.println("magic number");
	}else {
		System.out.println("not a magic number");
	}
}
}
