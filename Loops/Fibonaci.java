package Loops;

import java.util.Scanner;

public class Fibonaci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int c=a+b;
		a=b;
		b=c;
		
	System.out.println(c);
	}
	
}
}   
