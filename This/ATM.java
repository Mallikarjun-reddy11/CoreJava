package This;

import java.util.Scanner;

public class ATM {
	static double bal = 10000;

	public static void displaymenu() {
		System.out.println("1: Check Balance");
		System.out.println("2: Deposit amount");
		System.out.println("3: Withdraw amount");
		System.out.println("4: Exit");
	}

	public void CheckBalance() {
		System.out.println("CheckBalance: " + bal);

	}

	void deposit1(double deposit) {
		bal = deposit + bal;
		System.out.println("deposit: " + deposit);
		System.out.println("Available Balance: " + bal);

	}

	void withdraw(double amount) {
		bal = bal - amount;
		System.out.println("Withdrawl: " + amount);
		System.out.println("Available Balance: " + bal);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			displaymenu();
			System.out.println("Entert your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				ATM a = new ATM();
				a.CheckBalance();
				break;
			case 2:
				ATM a1 = new ATM();
				System.out.println("Enter the deposit amont: ");
				double deposit = sc.nextDouble();
				a1.deposit1(deposit);
				break;
			case 3:
				ATM a2 = new ATM();
				System.out.println("Enter the withdrawl amount: ");
				double amount = sc.nextDouble();
				a2.withdraw(amount);
				break;
			default:
				System.out.println("exit");
			}
		} while (choice != 4);

	}
}
