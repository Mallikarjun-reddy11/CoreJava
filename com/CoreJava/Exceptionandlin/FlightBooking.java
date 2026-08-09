package com.CoreJava.Exceptionandlin;

public class FlightBooking {
	public static void Availability(int seats) throws OutOfSeatsAvailability {
		int available = 15;
		if (seats > available) {
			throw new OutOfSeatsAvailability("The seats are not available in the selected class");
		} else {
			System.out.println("Booking successfull");
		}
	}
	public static void main(String[] args) throws OutOfSeatsAvailability {
		try {
			Availability(16);
		} catch (OutOfSeatsAvailability e) {
			System.out.println(e.getMessage());
		}
	}
}
