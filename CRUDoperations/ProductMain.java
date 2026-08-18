package CRUDoperations;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(100,"laptop",350000.0));
		list.add(new Product(101,"mobile",150000.0));
		list.add(new Product(102,"IronBox",5000.0));
		list.add(new Product(103,"HairDryer",5500.0));
		
		System.out.println("Initial List:\n" + list);
		
		// 1. READ (Search Operation)
		int id = 101;
		boolean found = false;
		
		for(Product p : list) {
			if(p.ProductID == id) { 
				System.out.println("\nProduct Found: " + p);
				found = true;
				break;
			}
		}

		if(!found) {
			System.out.println("\nproductID " + id + " not found");
		}
		
		// 2. UPDATE 
		int updateid = 102; 
		boolean found1 = false;
		
		for(Product p : list) {
			if(p.ProductID == updateid) { 
				System.out.println("\nProduct " + updateid + " Found for Update");
				p.ProductName = "Desktop";   
				p.ProductPrice = 70000.0;    

				found1 = true;
				System.out.println(p);
				System.out.println("Product updated successfully");
				break;
			}
		}
		
		if (!found1) {
			System.out.println("\nProduct " + updateid + " not found to update");
		}
			
		// 3. DELETE (Remove Operation)
		int deleteId = 103; 
		boolean deleteFound = false;

		for (Product p1 : list) { 
			if (p1.ProductID == deleteId) { 
				list.remove(p1); 
				deleteFound = true;
				System.out.println("\nProduct " + deleteId + " deleted successfully");
				break;
			}
		}

		if (!deleteFound) {
			System.out.println("\nProduct ID " + deleteId + " not found for deletion");
		}
	        
		
		System.out.println("\nFinal Product List:");
		System.out.println(list);
	}
}
