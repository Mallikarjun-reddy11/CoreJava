package ifstatement;

import java.util.Scanner;

public class Orderingsystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("b:burger\nc:pizza\ns:sandwich\nd:biryani\ne:coffee");

		System.out.println("what you want to order:");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'b':
			System.out.println("burger\nthe price is: 300₹");
			break;
		case 'c':
			System.out.println("pizza\nthe price is: 500₹");
			break;
		case 's':
			System.out.println("sandwich\nthe prize is: 400₹");
			break;
		case 'd':
			System.out.println("biryani\nthe prize is: 500₹");
			break;
		case 'e':
			System.out.println("coffee\nthe price is: 200₹");
		}
	}

}
