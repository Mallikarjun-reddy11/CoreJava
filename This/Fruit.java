package This;

import java.util.Scanner;

public class Fruit {
	String name;
	double price;
	String color;
	static Fruit fru[] = new Fruit[10];
	static int index = 0;

	public  Fruit(String name, double price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

static 	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fruit name: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		System.out.println("Enter the color: ");
		String color = sc.next();
		Fruit f = new Fruit(name, price, color);
		fru[index++] = f;
		System.out.println("Fruit added successfully");

	}

static void display() {
	for(int i=0;i<index;i++) {
		System.out.println(fru[i].name);
		System.out.println(fru[i].price);
		System.out.println(fru[i].color);
	}
}
public static void main(String []args) {
	add();
	display();
	
}

}

