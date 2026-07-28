package Abstraction;

public class BiryaniRestaurent extends Resturant {

	public BiryaniRestaurent(String name, String location) {
		super(name, location);
	}

	@Override
	public void prepareFood() {
		System.out.println("Preparing biryani with extra masala and tender chicken.");
	}
}
