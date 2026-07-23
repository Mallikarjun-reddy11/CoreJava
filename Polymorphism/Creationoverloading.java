package Polymorphism;

public class Creationoverloading {
public static void main(String[] args) {
	Bankaccount b1=new Bankaccount("Mallikarjun");
	Bankaccount b2=new Bankaccount("Sarayu","Savings");
	Bankaccount b3=new Bankaccount("Sai ","Current",12000);
	b1.display();
	b2.display();
	b3.display();
}
}
