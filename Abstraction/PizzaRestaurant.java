package Abstraction;

class PizzaRestaurant extends Resturant {

	public PizzaRestaurant(String name, String location) {
		super(name, location);
	}

	@Override
	public void prepareFood() {
		System.out.println("Preparing chicken pizza by adding toppings and baking it.");
	}
}
