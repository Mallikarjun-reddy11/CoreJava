package ifstatement;

import java.util.Scanner;

public class Performance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		if (p >=90 && p <= 100) {
			System.out.println("Outstanding");
		} else if (p >= 80 && p <= 89) {
			System.out.println("excellent");
		} else if (p >= 70 && p <= 79) {
			System.out.println("Good");
		} else if (p >= 60 && p <=79) {
			System.out.println("Average");
		}
		else  {
			System.out.println("needs improvement");
		}
	}
	// TODO Auto-generated method stub

}
