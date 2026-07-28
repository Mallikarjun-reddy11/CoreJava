package Abstraction;

class Bakery extends Resturant {

	public Bakery(String name, String location) {
		super(name, location);
	}

	@Override
	public void prepareFood() {
		System.out.println("Preparing chicken puffs by mixing ingredients and baking them.");
	}
}
