package Inheritance;

public class Account {

    String accountHolder;
    int accountNumber;
    double balance;

    Account(String name, int accNo, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }

    void displayAccount() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : Rs." + balance);
    }
}