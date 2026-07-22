package Encapsulation;

public class App {
public static void main(String[] args) {

    Food o = new Food();

    o.setid(101);
    o.setcustomername("Arjun");
    o.setamount(1200);
    o.setorderstatus("Preparing ");

    System.out.println("Order ID      : " + o.getid());
    System.out.println("Customer Name : " + o.getcustomername());
    System.out.println("Total Amount  : " + o.getamount());
    System.out.println("Order Status  : " + o.getorderstatus());
}}
