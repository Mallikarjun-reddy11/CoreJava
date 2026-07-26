package Inheritance;

public class Animal {
String name="animal";
public Animal(int a) {
	System.out.println(a);
	System.out.println("Its animal const");
}
void makesound() {
	System.out.println("Its animal");
	System.out.println(getClass().getSuperclass());
}
}
