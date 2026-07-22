package Polymorphism;

public class TicketBookingMain {
public static void main(String[] args) {
	Ticketbooking b1=new Ticketbooking();
	int sum=b1.book(200,350);
	b1.book(250, false);
	b1.book(350, true);

}
}
