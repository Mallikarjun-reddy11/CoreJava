package Arrays;

import java.util.Scanner;

public class Fruitnames {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the arr");
	int size=sc.nextInt();
	String arr[]=new String[size];
	
			
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter "+i+"th postion is ");
		arr[i]=sc.next();
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
