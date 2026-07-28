package Abstraction;

public abstract class Resturant {
	 String name;
	 String location;

	public Resturant(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void displayDetails() {
		System.out.println("Restaurant Name: " + name);
		System.out.println("Location: " + location);
	}

	public abstract void prepareFood();
}
