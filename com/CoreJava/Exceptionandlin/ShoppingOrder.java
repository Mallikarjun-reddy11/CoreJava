package com.CoreJava.Exceptionandlin;

public class ShoppingOrder {
	public static void ShoppingOrder(int stock, int request, String product) throws StockInsufficient {
		if (request > stock) {
			throw new StockInsufficient("The selected order stock is insufficient");
		} else {
			System.out.println("Enter the quantity: " + request);
			System.out.println("Product: " + product);
			System.out.println("The order is confirmed");
			int remaining = stock - request;
			System.out.println("Remaining Stock: " + remaining);
		}
	}

	public static void main(String[] args) throws StockInsufficient {
		try {
			ShoppingOrder(200, 205, "Laptop");

		} catch (StockInsufficient e) {
			System.out.println(e.getMessage());
		}
	}
}
