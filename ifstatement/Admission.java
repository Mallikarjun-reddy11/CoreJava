package ifstatement;

import java.util.Scanner;

public class Admission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int p = sc.nextInt();
		int a = sc.nextInt();
		if (r <= 1000 && p >= 75) {
			if (a >= 17) {
				System.out.println("admission confirmed");
			} else {
				System.out.println("not eligible");
			}}
			else {
				System.out.println("not confirmed");
				
			}

		}
	}
