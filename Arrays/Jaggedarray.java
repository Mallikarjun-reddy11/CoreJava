package Arrays;

import java.util.Scanner;

public class Jaggedarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size:");
	int n=sc.nextInt();
	int arr[][]=new int [n][];
	for(int i=0;i<n;i++) {
		System.out.println("Enter the no.of columns "  + i + " row " );
		int m=sc.nextInt();
		arr[i]=new int[m];
		for (int j=0;j<m;j++) {
			System.out.println("enter the no of elements ");
			arr[i][j]=sc.nextInt();
		}
		
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}
