package Polymorphism;

public class ConstructorShopping {
	String  prodname;
	int price;
	String category;
	
public  ConstructorShopping (String  prodname) {
	this.prodname=prodname;
}
public ConstructorShopping(String prodname,int price) {
	this(prodname);
	this.price=price;
}
public ConstructorShopping(String prodname,int price,String category) {
this(prodname,price);
	this.category=category;
}
void display() {
    System.out.println("Product Name : " + prodname);
    System.out.println("Price        : " + price);
    System.out.println("Category     : " + category);
    System.out.println();
}
}