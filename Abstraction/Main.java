package Abstraction;

public class Main {

	public static void main(String[] args) {

		Resturant restaurant = new PizzaRestaurant("Domino's Pizza", "Banjarahills");

		restaurant.displayDetails();
		restaurant.prepareFood();
		System.out.println();
		restaurant = new BiryaniRestaurent("Meridian", "Punjagutta");
		restaurant.displayDetails();
		restaurant.prepareFood();
		System.out.println();
		restaurant = new Bakery("pooja  Bakers", "Kompally");
		restaurant.displayDetails();
		restaurant.prepareFood();
	}
}