package com.CoreJava.Exceptionandlin;

public class ArrayIndex {
public static void main(String[] args) {
	int arr[]=new int[4];
	try {
		arr[5]=0;
		System.out.println();
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array is not in range ");
	}
}
}
