package Polymorphism;

public class Ticketbooking {
	int tickets;
	int price;
	static double totalamount;
	

	public int book(int tickets) {
		System.out.println(" 2 tickets");
		return tickets;
	}

	public void book(int t1, boolean isprimium) {
		if (isprimium == true) {
			price = 350;
			System.out.println("premium ticket ");

		} else {
			price = 200;
			System.out.println("normal ticket");
			totalamount = t1 * price;
			System.out.println("total amount");
		}
	}

	public void book(int t1, boolean isprimium, double discount) {
		if (isprimium == true) {
			price = 350;
			discount = totalamount * discount / 100;
			System.out.println("total amount after discount");
		}
	}
}
