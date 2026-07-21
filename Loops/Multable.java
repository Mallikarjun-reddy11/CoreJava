package Loops;


import java.util.Scanner;

public class Multable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int mul=0;
	for(int i=1;i<=10;i++) {
		mul=n*i;
	

    System.out.println( mul);
	}
}
}
