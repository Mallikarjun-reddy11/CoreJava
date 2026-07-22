package Polymorphism;

public class Electricity {
	public void bill(int units) {
		double bill = units * 8;
		System.out.println("Units: " + units);
		System.out.println("bill: " + bill);
		System.out.println();
	}

	public void bill(int units, double servicecharge) {
		double bill = units * 8 + servicecharge;
		System.out.println("Units: " + units);
		System.out.println("Service charge: " + servicecharge);
		System.out.println("bill: " + bill);
		System.out.println();
	}

	public void bill(int units, double servicecharge, double tax) {
		double bill = units * 8 + servicecharge;
		double finalbill = bill + (bill * tax / 100);
		System.out.println("Units: " + units);
		System.out.println("Service charge: " + servicecharge);
		System.out.println("tax: " + tax);
		System.out.println("bill: " + bill);

	}
}
