package Arrays;

import java.util.Scanner;

public class Array2d {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int arr[][]= {{2,3,7},{4,5,6}};
	for(int i=0;i<arr.length;i++) {
		for (int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
	

	
}
}
