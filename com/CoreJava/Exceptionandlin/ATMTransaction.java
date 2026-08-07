package com.CoreJava.Exceptionandlin;

public class ATMTransaction {
	public static void Date(int Actualdate) throws DateExpired {
		int Expireddate=2024;
		if (Actualdate > Expireddate) {
			throw new DateExpired("Your card has been expired");

		} else {
			System.out.println("Transcation successfull");
		}
	}
	public static void main(String[] args) throws DateExpired {
		try {
			Date(2026);
		} catch (DateExpired e) {

			System.out.println(e.getMessage());
		}
	}
}
