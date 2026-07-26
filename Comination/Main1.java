package Comination;

public class Main1 {
public static void main(String[] args) {
	System.out.println("-----Developer details----");
	Developer d=new Developer(201,"Anjali",65000,"Java","Online Banking system");
	d.display();
	System.out.println();
	System.out.println("------Tester details------");
Tester t=new Tester(201,"Anjali",65000,"Selenium","Hybrid Framework");
t.display();
}
}
