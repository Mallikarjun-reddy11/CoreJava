package Polymorphism;

public class Ticketbooking {

	public void book(int tickets) {
		int amount = tickets * 200;
		System.out.println("Total Amount = ₹ " + amount);
	}

	public void book(int tickets, boolean isprimium) {
		int amount;
		if (isprimium) {
			amount = tickets * 350;

		} else {
			amount = tickets * 200;
		}
		System.out.println("Total Amount = ₹" + amount);
	}

	public void book(int tickets, boolean isprimium, double discount) {
		double amount;
		if (isprimium) {
			amount = tickets * 350;

		} else {
			amount = tickets * 200;
		}
		double finalamount = amount - (amount * discount / 100);
		System.out.println("Amount Before Discount = ₹" + amount);
		System.out.println("Discount = " + discount + "%");
		System.out.println("Final Payable Amount = ₹" + finalamount);

	}
}
