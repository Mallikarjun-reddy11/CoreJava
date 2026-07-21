package ifstatement;

import java.util.Scanner;

public class Withdrawl {
	public static void main(String[] args) {
	int p=1234;
	int b=2000000;
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		int wa = sc.nextInt();

		if (p == pin) {
			if (b>= wa) {
				System.out.println("collect your cas");
			} else {
				System.out.println("in sufficient balance");
			}
		} else {
			System.out.println("in valid pin");
		}
	}

}
