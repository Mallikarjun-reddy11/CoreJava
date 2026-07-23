package Polymorphism;

public class Overloading {
	public static void main(String[] args) {
	ConstructorShopping p1 = new ConstructorShopping("Laptop");

	ConstructorShopping p2 = new ConstructorShopping("Mobile", 25000);

	ConstructorShopping p3 = new ConstructorShopping("Headphones", 1500, "Electronics");
p1.display();
p2.display();
p3.display();
}}