package This;

	import java.util.Scanner;

	public class Foodordering{

	    String customer, restaurant, food;
	    int quantity;
	    double price, bill, discount, delivery, finalBill;

	    void getDetails() {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Customer Name : ");
	        customer = sc.nextLine();

	        System.out.print("Restaurant : ");
	        restaurant = sc.nextLine();

	        System.out.print("Food Item : ");
	        food = sc.nextLine();

	        System.out.print("Quantity : ");
	        quantity = sc.nextInt();

	        System.out.print("Price : ");
	        price = sc.nextDouble();
	    }

	    double calculateBill() {
	        return quantity * price;
	    }

	    double calculateDiscount(double bill) {
	        if (bill > 1000)
	            return bill * 0.15;
	        return 0;
	    }

	    double deliveryCharge(double bill) {
	        if (bill < 500)
	            return 50;
	        return 0;
	    }

	    void printBill() {

	        System.out.println("Customer : " + customer);
	        System.out.println("Restaurant : " + restaurant);
	        System.out.println("Food : " + food);
	        System.out.println("Bill : " + bill);
	        System.out.println("Discount : " + discount);
	        System.out.println("Delivery : " + delivery);
	        System.out.println("Final Bill : " + finalBill);
	    }

	    public static void main(String args[]) {

	        Foodordering  obj = new Foodordering();

	        obj.getDetails();

	        obj.bill = obj.calculateBill();

	        obj.discount = obj.calculateDiscount(obj.bill);

	        obj.delivery = obj.deliveryCharge(obj.bill);

	        obj.finalBill = obj.bill - obj.discount + obj.delivery;

	        obj.printBill();
	    }
	}