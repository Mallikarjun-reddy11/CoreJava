package Polymorphism;

public class Calculator {
public int add(int a,int b) {
	System.out.println("2 parameter list");
	return a+b;
}
public int add(int a,int b,int c) {
	System.out.println("3 parameter list");
	return a+b+c;
}
public double add(double a,double b) {
	System.out.println(" 2 parameters with diff intialisation");
	return a+b;
}
static  void add(int a,double b) {
	System.out.println(" 2 parameters with static ");
	
}
}
