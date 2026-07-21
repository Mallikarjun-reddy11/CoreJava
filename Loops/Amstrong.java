package Loops;

import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int temp=n;
	while(n!=0) {
		int rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
		
	}
	if(temp ==sum) {
		System.out.println("Armstrong num");
	}else {
		System.out.println("not a amstrong");
	}
}
}
