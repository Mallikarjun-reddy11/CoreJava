package Polymorphism;

public class TicketBookingMain {
public static void main(String[] args) {
	Ticketbooking b1=new Ticketbooking();
    System.out.println("Booking 1");
    b1.book(3);

    System.out.println("\nBooking 2");
 b1.book(3, true);

    System.out.println("\nBooking 3");
    b1.book(3, true, 10);

}
}
