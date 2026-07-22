package Encapsulation;

public class Balance {
public static void main(String[] args) {
    Bank b1 = new Bank();

    b1.setacc(1234567);
    b1.setname1("Arjun");

    b1.setavlbalance(1200);
    b1.setdeposit1(1000);   
    b1.setwithdraw1(667);   

    System.out.println("Account Number    : " + b1.getacc());
    System.out.println("Name              : " + b1.getname1());
    System.out.println("Withdraw          : " + b1.getwithdraw1());
    System.out.println("Deposit           : " + b1.getdeposit1());
    System.out.println("Available Balance : " + b1.getavlbalance());
}
}

