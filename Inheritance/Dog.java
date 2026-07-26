package Inheritance;

public class Dog extends Animal {
public Dog(int a) {
	super(a);
	
}
String name="Dog";

public Dog() {
	super(20);
	System.out.println("Its dog const");
}
void makesound() {
	System.out.println("bow bow ....");
}
void display() {
	System.out.println(name);
	System.out.println(super.name);
makesound();
super.makesound();
System.out.println(getClass());
}
}
