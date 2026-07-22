package Polymorphism;

public class Bill {
	public static void main(String[] args) {
		Electricity e1 = new Electricity();
		System.out.println("Bill 1");
		e1.bill(23);
		System.out.println("Bill 2");
		e1.bill(23, 5);
		System.out.println("Bill 3");
		e1.bill(56, 5, 10);
	}
}
