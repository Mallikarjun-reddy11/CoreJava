package ifstatement;

import java.util.Scanner;

public class Atmswitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("check balance" + "\n" + "deposit money" + "\n" + "withdraw money" + "\n" + "mini statement"
				+ "\n" + "exit");
		System.out.println("Enter your choice:");
		int atm = sc.nextInt();
		switch (atm) {
		case 1:
			System.out.println("your balance is 40000000");
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			break;
		case 3:
			System.out.println("Enter the amount to withdraw");
			break;
		case 4:
			System.out.println("Thank you for using our ATM");
			break;
		case 5:
			System.out.println("Invalid choice");
		}
		sc.close();
	}
}
