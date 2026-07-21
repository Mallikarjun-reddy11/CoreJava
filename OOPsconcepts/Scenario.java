package OOPsconcepts;

public class Scenario {
	int id;
	String brand;
	String model;
	double price;
	public Scenario() {
		id = 1001;
		brand = "Samsung";
		model = "Galaxy A35";
		price = 28000.0;
	}
	public Scenario(int sid, String sbrand, String smodel, double sprice) {
		id = sid;
		brand = sbrand;
		model = smodel;
		price = sprice;
	}
	public Scenario(Scenario s2) {
		id = s2.id;
		brand = s2.brand;
		model = s2.model;
		price = s2.price;
	}
	public void display() {
		System.out.println(
				"Mobile ID: " + id + "\n" + "Brand: " + brand + "\n" + "Model: " + model + "\n" + "Price: " + price);
		System.out.println();
	}
	public static void main(String[] args) {
		Scenario s1 = new Scenario();
		System.out.println("Mobile 1 (Default constructor)");
		s1.display();
		Scenario s2 = new Scenario(1002, "One plus", "Nord CE 5", 24999.0);
		System.out.println("Mobile 2 (Parameterised constructor)");
		s2.display();
		Scenario s3 = new Scenario(s2);
		s3.price = 23000.0;
		System.out.println("Mobile 3 (Copy  constructor)");
		s3.display();
	}
}
