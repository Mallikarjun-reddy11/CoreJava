package Inheritance;

public class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(String name, int accNo, double bal, double rate) {
        super(name, accNo, bal);
        interestRate = rate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned : Rs." + interest);
    }
} 