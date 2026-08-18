package CRUDoperations;

public class Product {

	int ProductID;
	String ProductName;
	double ProductPrice;
	
	
	
	//CONSTRUCTOR
	public Product(int productID, String productName, double productPrice) {
		super();
		ProductID = productID;
		ProductName = productName;
		ProductPrice = productPrice;
	}



	@Override
	public String toString() {
		return "\nProducts: \nProductID: " + ProductID + "\nProductName: " + ProductName + "\nProductPrice: " + ProductPrice
				+ "]";
	}
	
	

}
