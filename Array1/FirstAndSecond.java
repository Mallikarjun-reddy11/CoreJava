package Array1;

import java.util.Scanner;

public class FirstAndSecond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int first = arr[0];
		int second = arr[0];

		for (int i = 1; i < n; i++) {

			if (arr[i] > first) {

				second = first;
				first = arr[i];

			} else if (arr[i] > second && arr[i] != first) {

				second = arr[i];

			}
		}

		System.out.println("First Largest = " + first);
		System.out.println("Second Largest = " + second);

		sc.close();
	}
}